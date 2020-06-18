package cts.popescu.mihaela.g1082;

import cts.popescu.mihaela.g1082.teste.exceptii.ExceptieFacturaFaraProduse;

import java.util.ArrayList;
import java.util.List;

public class Facturare {
	List<Produs> produse;

	public Facturare() {
		produse = new ArrayList<Produs>();
	}
	
	public void adaugaProdusPeFactura(Produs produs) {
		produse.add(produs);
	}
	
	public Double calculValoareProduseFaraTVA() {
		double sumaTotala=0;
		for(Produs produs:produse) {
			sumaTotala+=produs.getPret();
		}
		return new Double(sumaTotala);
	}
	
	public void printareBonDeCasa() {
		System.out.println("BON FISCAL");
		for(Produs produs:produse) {
			System.out.println(produs.toString());
		}
		
		System.out.println("Total: "+ calculValoareProduseFaraTVA());
	}
	
	//pentru un TVA de 19% valoare primita trebuie sa fie 0.19
	public Double calculValoareTVA(Double valoareFaraTVA, Double valoareTVA) {
		if(valoareFaraTVA==null) {
			throw new ExceptieFacturaFaraProduse("Valoarea este null!");
		}
		return new Double(valoareFaraTVA*valoareTVA);
	}
	
	public void printareFactura() {

		System.out.println("FACTURA");
		for(Produs produs:produse) {
			System.out.println(produs.toString());
		}
		Double sumaFactura= calculValoareProduseFaraTVA();
		System.out.println("Total factura fara TVA: "+ sumaFactura);
		System.out.println("TVA:"+(calculValoareTVA(sumaFactura, 0.19)));
	}

}
