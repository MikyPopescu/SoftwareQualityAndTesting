package ro.ase.csie.acs.cts.seminar11.proxy;

import java.util.HashMap;

public class ProxyLoginSecurizat implements InterfataLogin {

    InterfataLogin modulLoginInitial = null;
    HashMap<String, Integer> contorAutentificari = new HashMap<>();
    public static final int MAX_INCERCARI = 3;

    //programare prin interfete (SOLID)
    public ProxyLoginSecurizat(InterfataLogin modulLogin) {
        this.modulLoginInitial = modulLogin;
    }

    @Override
    public boolean login(String username, String password) {
        // 3 autentificari nereusite => eroare
        Integer nrIncercari = contorAutentificari.get(username);
        //nu exista cheie, nu a mai incercat niciodata
        if (nrIncercari == null) {
            contorAutentificari.put(username, 0);
            nrIncercari = 0;
        }

        //verific daca a fost depasit nr de incercari admise
        if (nrIncercari >= MAX_INCERCARI) {
            System.out.println("Contul este blocat pentru "+username);
            return false;
        }

        if (this.modulLoginInitial != null) {
            boolean rezultat = this.modulLoginInitial.login(username, password); //trimit catre modulul initial care face login
            if (rezultat == false) {
                nrIncercari += 1;
                contorAutentificari.put(username, nrIncercari);
            }
            else {
                nrIncercari = 0;
                contorAutentificari.put(username, nrIncercari);
            }
            return rezultat;
        }
        else {
            throw new UnsupportedOperationException();
        }
    }
}
