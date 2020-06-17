package cts.patterns.miky.implementation;

//observer A
public class ModulInterfataJucator implements InterfataConexiuneListener {

    @Override
    public void conexiunePierduta(String timestamp) {
        System.out.println("Conexiune pierduta la " +timestamp);
    }

    @Override
    public void conexiuneActiva() {
        System.out.println("Conexiune activa! ");
    }
}
