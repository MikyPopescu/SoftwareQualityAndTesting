package template;

public class Bancomat extends TemplateRetragere{

	public Bancomat(String nrCard) {
		super(nrCard);
	}

	@Override
	public void introducereCard() {
		System.out.println("A fost introdus cardul cu numarul " + nrCard);
	}

	@Override
	public void introducerePIN(String PIN) {
		System.out.println("A fost introdus PIN-ul " + PIN + " pentru cardul cu numarul " + nrCard);
	    sumaSpecificata = 0;
	}

	@Override
	public void introducereSuma(int suma) {
		if(suma > 0) {
			System.out.println("Se doreste retragerea sumei de " + suma);
			sumaSpecificata = suma;
		}else {
			System.out.println("Va rugam sa introduceti o suma valida!");
			sumaSpecificata = 0;
		}
	}

	@Override
	public int retragereSuma() {
		if(sumaSpecificata!=0) {
			System.out.println("A fost retrasa suma de " + sumaSpecificata);
			return sumaSpecificata;
		}else {
			return 0;
		}
	}

	@Override
	public void retragereCard() {
		System.out.println("A fost retras cardul cu numarul " + nrCard);
	}

}
