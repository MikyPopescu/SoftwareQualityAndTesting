package ro.ase.csie.cts.varianta1.unittesting.clase;

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
		switch(tipPromotie){
		case 1:
			this.pret = pret;
			break;
		case 2:
			this.pret = pret/2;
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
