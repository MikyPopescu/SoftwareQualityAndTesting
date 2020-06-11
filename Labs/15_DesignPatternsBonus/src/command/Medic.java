package command;

public class Medic {

	private String nume;
	private String specializare;
	
	public Medic(String nume, String specializare) {
		super();
		this.nume = nume;
		this.specializare = specializare;
	}
	
	public void internare(String pacient) {
		System.out.println("Medicul " + this.nume + " a efectuat o internare pentru pacientul " + pacient);
	}
	
	public void tratareImediata(String pacient) {
		System.out.println("Medicul " + this.nume + " a tratat pacientul " + pacient);
	}
	
}
