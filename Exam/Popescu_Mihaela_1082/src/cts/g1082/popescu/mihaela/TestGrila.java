package cts.g1082.popescu.mihaela;

import cts.g1082.popescu.mihaela.exceptii.ExceptiePunctajInvalid;

import java.util.ArrayList;
import java.util.Arrays;

public class TestGrila {
	String denumire;		//minim 5 caractere, maxim 50
	int punctajMaxim;		//cuprins in intervalul [10, 90]
	int dificultate;		//cuprinsa in intervalul [1, 5]
	
	ArrayList<String> intrebari;
	ArrayList<Integer> punctajeIntrebari;
	
	
	public TestGrila(String denumire, int punctajMaxim, int dificultate) {
		super();
		this.denumire = denumire;
		this.punctajMaxim = punctajMaxim;
		this.dificultate = dificultate;
	}

	public void setIntrebari(String[] intrebari01, int[] punctaje) throws ExceptiePunctajInvalid {
		if(intrebari01 == null || punctaje == null ) {
			throw new ExceptiePunctajInvalid();
		}

		this.intrebari = new ArrayList<>();
		for(String intrebare : intrebari01)
			this.intrebari.add(intrebare);

		this.punctajeIntrebari = new ArrayList<>();
		for(int puncte : punctaje)
			this.punctajeIntrebari.add(puncte);
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public ArrayList<String> getIntrebari() {
		return intrebari;
	}

	public int getDificultate() {
		return dificultate;
	}

	public void setDificultate(String dificultate) {
		if (dificultate.equals("usor"))
			this.dificultate = 1;
		else if (dificultate.equals("dificil"))
			this.dificultate = 2;
		else if (dificultate.equals("pro"))
			this.dificultate = 3;
		else
			throw new UnsupportedOperationException();
	}
	
	
	
	public int getPunctajMaxim() {
		return punctajMaxim;
	}

	public void setPunctajMaxim(int punctajMaxim) {
		this.punctajMaxim = punctajMaxim;
	}

	//calculeaza suma punctelor tuturor intrebarilor din test
	public int calculTotalPuncte(){
		int total = 0;
		for(int punctaj : this.punctajeIntrebari)
			total += punctaj;
		
		switch(this.dificultate) {
		case 1:
			return total;
		case 2: 
			return total * 2;
		default:
			throw new UnsupportedOperationException();
		}
		
	}
	
	public float calculPunctajPerIntrebare() {
		return this.punctajMaxim / this.intrebari.size();
	}
	
}
