package state;

public class Program {

	public static void main(String[] args) {
		Masa masa = new Masa(15);
		masa.elibereaza();
		
		masa.rezerva();
		masa.elibereaza();
		
		masa.ocupa();
		masa.elibereaza();

	    StareLibera ocupata = new StareLibera();
	    ocupata.schimbareStare(masa);
	}

}
