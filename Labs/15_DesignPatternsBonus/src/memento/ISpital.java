package memento;

public interface ISpital {
	
	public Memento saveMemento();
	public void restoreFromMemento(Memento memento);

}
