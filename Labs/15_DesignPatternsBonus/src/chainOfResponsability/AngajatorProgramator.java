package chainOfResponsability;

public class AngajatorProgramator extends Angajator{

	@Override
	public void angajeazaCandidat(Candidat candidat) {
		if(candidat.isCompetenteProgramare() && candidat.isCompetenteTestare()) {
			System.out.println("Candidatul "+ candidat.getNume() + " este angajat pe pozitia de programator.");
		} else {
			super.getAngajator().angajeazaCandidat(candidat);
		}
		
	}

}
