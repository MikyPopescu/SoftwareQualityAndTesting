package command;

import java.util.ArrayList;
import java.util.List;

public class Operator {

	private List<IComanda> comenzi;
	
	public Operator() {
		this.comenzi = new ArrayList<IComanda>();
	}
	
	public void invoca(IComanda comanda) {
		if(comanda!=null) {
			comenzi.add(comanda);
		}
	}
	
	public void executaComanda() {
		if(comenzi.size() > 0) {
			comenzi.get(0).executa();
			comenzi.remove(0);
		}
	}
	
	public void executaComenzi() {
		for (IComanda comanda : comenzi) {
			comanda.executa();
		}
		comenzi.removeAll(comenzi);
	}
}

