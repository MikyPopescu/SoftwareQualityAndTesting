package ro.ase.csie.acs.cts.seminar13.observer;

public class ModulInterfataJoc implements NotificareConexiune {

    @Override
    public void conexiuneInchisa() {
        System.out.println("Avertizare jucator: Conexiune pierduta !");
    }
}
