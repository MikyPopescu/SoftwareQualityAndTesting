package cts.popescu.mihaela.g1082;

import cts.popescu.mihaela.g1082.teste.exceptii.ExceptiePretPreaMare;

public class Produs {

	private String denumireProdus;
	private Double pret;
	public Produs(String denumireProdus, Double pret) {
		super();
		this.denumireProdus = denumireProdus;
		this.pret = pret;
	}
	public void setDenumireProdus(String denumireProdus) {
		this.denumireProdus = denumireProdus;
	}
	
	public void setPret(Double pret, int tipPromotie) {

		if(pret > 1000) {
			throw new ExceptiePretPreaMare("Pret prea mare!");

		}

		switch(tipPromotie){
			case 1:
				this.pret = pret;
				break;
			case 2:
				this.pret = pret/2;
				break;

			default:
				this.pret = pret;
		}
		
	}
	public String getDenumireProdus() {
		return denumireProdus;
	}
	public Double getPret() {
		return pret;
	}
	@Override
	public String toString() {
		return "Produs [" + denumireProdus + ",    pret=" + pret + "]";
	}
	
	
}
