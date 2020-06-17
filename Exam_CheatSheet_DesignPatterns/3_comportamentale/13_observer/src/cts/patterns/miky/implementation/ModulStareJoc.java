package cts.patterns.miky.implementation;

//observerB
public class ModulStareJoc implements InterfataConexiuneListener {

    @Override
    public void conexiunePierduta(String timestamp) {
        System.out.println("Salvare stare curenta joc");
    }

    @Override
    public void conexiuneActiva() {
        System.out.println("restaurare stare");
    }
}
