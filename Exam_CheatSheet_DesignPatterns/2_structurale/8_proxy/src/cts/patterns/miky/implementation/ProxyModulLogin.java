package cts.patterns.miky.implementation;

import cts.patterns.miky.implementation.InterfataModulLogin;

public class ProxyModulLogin implements InterfataModulLogin {
    InterfataModulLogin modulLogin;
    int nrIncercari = 0;

    public ProxyModulLogin(InterfataModulLogin modulLogin) {
        this.modulLogin = modulLogin;
    }

    @Override
    public boolean login(String user, String pass) {
        if (nrIncercari >= 3) {
            System.out.println("Notific utilizatorul");
            return false;
        }
        //ce fac in plus? -> la trei incercari gresite => afara
        boolean esteAutentificat = this.modulLogin.login(user, pass);
        if (!esteAutentificat) {
            nrIncercari += 1;
        } else {
            nrIncercari = 0;
        }
        return esteAutentificat;
    }
}
