package memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerBackup {
	
	private List<Memento> lista;

	public ManagerBackup() {
		this.lista = new ArrayList<>();
	}
	
	public void adaugareBackup(Memento memento) {
		lista.add(memento);
	}
	
	public Memento getMemento(int position) {
		if(position < lista.size() && position >= 0) {
			return lista.get(position);
		}
		return null;
	}
	

}
