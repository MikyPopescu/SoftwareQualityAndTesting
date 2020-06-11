package chainOfResponsability;

public class AngajatorManager extends Angajator{

	@Override
	public void angajeazaCandidat(Candidat candidat) {
		if(candidat.isCompetenteManageriale() && candidat.isCompetenteProgramare() && candidat.isCompetenteTestare()) {
			System.out.println("Candidatul "+ candidat.getNume() + " este angajat pe pozitia de manager.");
		} else {
			super.getAngajator().angajeazaCandidat(candidat);;
		}
		
	}
	
}
