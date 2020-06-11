package memento;

public class Memento {

	private int nrPacienti;
	private int nrMedici;
	
	public Memento(int nrPacienti, int nrMedici) {
		super();
		this.nrPacienti = nrPacienti;
		this.nrMedici = nrMedici;
	}

	public int getNrPacienti() {
		return nrPacienti;
	}

	public int getNrMedici() {
		return nrMedici;
	}
	
	
}
