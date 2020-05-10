package ro.ase.csie.acs.cts.seminar11.facade;

import ro.ase.csie.acs.cts.seminar11.proxy.Login;

public class FacadeAPIJoc {
    public void accesForum(){
        //actiuni pentru a accesa forumul
        ConexiuneBD conexiuneBD = new ConexiuneBD();
        conexiuneBD.connect();
        ro.ase.csie.acs.cts.seminar11.facade.Login modulLogin = new ro.ase.csie.acs.cts.seminar11.facade.Login();
        modulLogin.login("test","test");
        ForumJoc forumJoc = new ForumJoc();
        Profil profilJucator = new Profil();
        conexiuneBD.disconnect();
    }

    public Profil getProfilJucator(){
        ConexiuneBD conexiuneBD = new ConexiuneBD();
        conexiuneBD.connect();
        ro.ase.csie.acs.cts.seminar11.facade.Login modulLogin = new ro.ase.csie.acs.cts.seminar11.facade.Login();
        modulLogin.login("test","test");
        Profil profilJucator = new Profil();
        conexiuneBD.disconnect();

        return profilJucator;
    }
}
