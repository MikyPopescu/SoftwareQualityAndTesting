package ro.ase.csie.acs.cts.seminar11.test;

import ro.ase.csie.acs.cts.seminar11.facade.ConexiuneBD;
import ro.ase.csie.acs.cts.seminar11.facade.FacadeAPIJoc;
import ro.ase.csie.acs.cts.seminar11.facade.ForumJoc;
import ro.ase.csie.acs.cts.seminar11.facade.Profil;
import ro.ase.csie.acs.cts.seminar11.proxy.Login;
import ro.ase.csie.acs.cts.seminar11.proxy.InterfataLogin;
import ro.ase.csie.acs.cts.seminar11.proxy.ProxyLoginSecurizat;

public class TestClientJoc {
    public static void main(String[] args) {
        //Problema Proxy: simulare atac
        String dictionarParole[] = new String[]{"123456", "1234", "player1", "root", "player11234", "1234player", "1234"};

        InterfataLogin login = new Login();
        int nrIncercari = 0;
        for (String parola : dictionarParole) {
            nrIncercari++;
            if (login.login("player1", parola)) {
                System.out.println("Parola gasita: " + parola);
                System.out.println("Numar incercari: " + nrIncercari);
                break;
            }
        }
        System.out.println("Sesiune terminata");


        //Test Proxy
        InterfataLogin proxyLogin = new ProxyLoginSecurizat(new Login());
        nrIncercari = 0;
        for (String parola : dictionarParole) {
            nrIncercari++;
            if (proxyLogin.login("player1", parola)) {
                System.out.println("Parola gasita: " + parola);
                System.out.println("Numar incercari: " + nrIncercari);
                break;
            }
        }
        System.out.println("Sesiune terminata");



        //Problema Facade
        //actiuni pentru a accesa forumul
        ConexiuneBD conexiuneBD = new ConexiuneBD();
        conexiuneBD.connect();
        ro.ase.csie.acs.cts.seminar11.facade.Login modulLogin = new ro.ase.csie.acs.cts.seminar11.facade.Login();
        modulLogin.login("test","test");
        ForumJoc forumJoc = new ForumJoc();
        Profil profilJucator = new Profil();
        conexiuneBD.disconnect();


        //Test Facade
        FacadeAPIJoc apiJoc = new FacadeAPIJoc();
        apiJoc.accesForum();
    }
}






