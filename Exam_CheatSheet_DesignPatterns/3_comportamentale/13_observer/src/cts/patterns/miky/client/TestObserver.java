package cts.patterns.miky.client;

import cts.patterns.miky.implementation.ModulInterfataJucator;
import cts.patterns.miky.implementation.ModulMonitorizareConexiune;
import cts.patterns.miky.implementation.ModulStareJoc;

public class TestObserver {
    public static void main(String[] args) {
        System.out.println("\n------------------------------\n");
        ModulMonitorizareConexiune monitorizareConexiune = new ModulMonitorizareConexiune();
        monitorizareConexiune.notificareConexiunePierduta();

        ModulInterfataJucator interfataJucator=new ModulInterfataJucator();
        ModulStareJoc stareJoc = new ModulStareJoc();

        monitorizareConexiune.registerObservator(interfataJucator);
        monitorizareConexiune.registerObservator(stareJoc);
        monitorizareConexiune.notificareConexiunePierduta();

        System.out.println("\n------------------------------\n");
        monitorizareConexiune.unregisterObservator(stareJoc);
        monitorizareConexiune.notificareConexiuneActiva();
    }
}
