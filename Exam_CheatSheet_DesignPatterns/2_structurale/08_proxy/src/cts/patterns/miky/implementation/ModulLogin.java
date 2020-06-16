package cts.patterns.miky.implementation;

public class ModulLogin implements InterfataModulLogin {

    String user;
    String pass;

    public ModulLogin(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    @Override
    public boolean login(String user, String pass) {
        if(user.equals(this.user) && pass.equals(this.pass)){
            return true;
        }
        return false;
    }
}
