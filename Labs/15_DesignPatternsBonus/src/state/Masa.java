package state;

public class Masa {
	private IState stare;
	private int nrMasa;
	
	public Masa(int nrMasa) {
		super();
		this.stare = new StareLibera();
		this.nrMasa = nrMasa;
	}

	public void setStare(IState stare) {
		this.stare = stare;
	}
	
	public void rezerva() {
		if (stare instanceof StareLibera) {
			this.stare= new StareRezervata();
			this.stare.prezintaStare(this.nrMasa);
		}else {
			System.out.println("Masa " + this.nrMasa + " nu poate fi rezervata!");
		}
	}
	
	public void ocupa() {
		if(!(stare instanceof StareOcupata)) {
			this.stare= new StareOcupata();
			this.stare.prezintaStare(this.nrMasa);
		}else {
			System.out.println("Masa " + this.nrMasa + " nu poate fi ocupata!");
		}
	}

	public void elibereaza() {
		if(!(stare instanceof StareLibera)) {
			this.stare= new StareLibera();
			this.stare.prezintaStare(this.nrMasa);
		}else {
			System.out.println("Masa " + this.nrMasa + " este deja libera!");
		}
	}
}
