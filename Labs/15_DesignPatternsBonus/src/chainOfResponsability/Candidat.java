package chainOfResponsability;

public class Candidat {

	private String nume;
	private boolean competenteManageriale;
	private boolean competenteProgramare;
	private boolean competenteTestare;
	
	public Candidat(String nume, boolean competenteManageriale, boolean competenteProgramare,
			boolean competenteTestare) {
		super();
		this.nume = nume;
		this.competenteManageriale = competenteManageriale;
		this.competenteProgramare = competenteProgramare;
		this.competenteTestare = competenteTestare;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public boolean isCompetenteManageriale() {
		return competenteManageriale;
	}

	public void setCompetenteManageriale(boolean competenteManageriale) {
		this.competenteManageriale = competenteManageriale;
	}

	public boolean isCompetenteProgramare() {
		return competenteProgramare;
	}

	public void setCompetenteProgramare(boolean competenteProgramare) {
		this.competenteProgramare = competenteProgramare;
	}

	public boolean isCompetenteTestare() {
		return competenteTestare;
	}

	public void setCompetenteTestare(boolean competenteTestare) {
		this.competenteTestare = competenteTestare;
	}
	
	
}
