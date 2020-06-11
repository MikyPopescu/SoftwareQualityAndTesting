package memento;

public class Spital implements ISpital{

	private String nume;
	private int nrPacienti;
	private int nrMedici;
	
	public Spital(String nume, int nrPacienti, int nrMedici) {
		super();
		this.nume = nume;
		this.nrPacienti = nrPacienti;
		this.nrMedici = nrMedici;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getNrPacienti() {
		return nrPacienti;
	}

	public void setNrPacienti(int nrPacienti) {
		this.nrPacienti = nrPacienti;
	}

	public int getNrMedici() {
		return nrMedici;
	}

	public void setNrMedici(int nrMedici) {
		this.nrMedici = nrMedici;
	}

	@Override
	public Memento saveMemento() {
		Memento memento = new Memento(this.nrPacienti, this.nrMedici);
		return memento;
	}

	@Override
	public void restoreFromMemento(Memento memento) {
		this.nrPacienti=memento.getNrPacienti();
		this.nrMedici=memento.getNrMedici();
		
	}

	@Override
	public String toString() {
		return "Spital [nume=" + nume + ", nrPacienti=" + nrPacienti + ", nrMedici=" + nrMedici + "]";
	}
	
}
