package chainOfResponsability;

public abstract class Angajator {

	private Angajator angajator;

	public Angajator getAngajator() {
		return angajator;
	}

	public void setAngajator(Angajator angajator) {
		this.angajator = angajator;
	}

	public abstract void angajeazaCandidat(Candidat candidat);
	
	
}
