package memento;

public class Program {

	public static void main(String[] args) {
		Spital spital = new Spital("Spital1",20,30);
		ManagerBackup backup = new ManagerBackup();
		
		backup.adaugareBackup(spital.saveMemento());
		
		spital.setNrPacienti(40);
		System.out.println(spital.toString());
		
		spital.setNrMedici(26);
		System.out.println(spital.toString());
		
		backup.adaugareBackup(spital.saveMemento());
		
		spital.restoreFromMemento(backup.getMemento(0));
		System.out.println(spital.toString());
		

	}

}
