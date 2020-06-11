package ro.ase.csie.acs.cts.seminar14.state;

public interface InterfataActiuniCaracter {
    //cum obtin referinta la obiectul in sine
    //varianta 1 - interfata trebuie sa fie clasa abstracta
    //CaracterJoc caracter;

    public void seDeplaseaza();

    //varianta 2
    public void ataca(String inamic, int puncte, CaracterJoc caracter);
}
