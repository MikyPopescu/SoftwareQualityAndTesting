package chainOfResponsability;

public class Program {

	public static void main(String[] args) {
		Angajator angajatorManager = new AngajatorManager();
		Angajator angajatorProgramator = new AngajatorProgramator();
		Angajator angajatorTester = new AngajatorTester();
		Angajator raspunsNegativ = new RaspunsNegativ();
		
		angajatorManager.setAngajator(angajatorProgramator);
		angajatorProgramator.setAngajator(angajatorTester);
		angajatorTester.setAngajator(raspunsNegativ);
	
		Candidat candidat1 = new Candidat("Popescu", true, true, true);
		Candidat candidat2 = new Candidat("Itachi", false, false, false);
		Candidat candidat3 = new Candidat("Sasuke", false, true, true);
		Candidat candidat4 = new Candidat("Dutu", false, false, true);
		
		angajatorManager.angajeazaCandidat(candidat1);
		angajatorManager.angajeazaCandidat(candidat2);
		angajatorManager.angajeazaCandidat(candidat3);
		angajatorManager.angajeazaCandidat(candidat4);
	}

}
