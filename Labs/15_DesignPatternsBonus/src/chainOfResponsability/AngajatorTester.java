package chainOfResponsability;

public class AngajatorTester extends Angajator{

	@Override
	public void angajeazaCandidat(Candidat candidat) {
		if(candidat.isCompetenteTestare()) {
			System.out.println("Candidatul "+ candidat.getNume() + " este angajat pe pozitia de tester.");
		} else {
			super.getAngajator().angajeazaCandidat(candidat);
		}
		
	}

}
