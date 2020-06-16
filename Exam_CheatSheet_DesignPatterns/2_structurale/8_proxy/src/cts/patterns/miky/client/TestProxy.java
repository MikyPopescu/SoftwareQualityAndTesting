package cts.patterns.miky.client;

import cts.patterns.miky.implementation.ModulLogin;
import cts.patterns.miky.implementation.ProxyModulLogin;

public class TestProxy {
    public static void main(String[] args) {
        //login fara proxy
        ModulLogin modulLogin = new ModulLogin("admin","admin123");
        String[] dictionarParole = new String[]{"pass","1234","admin1","admin123"};

        for (String parola:dictionarParole){
            System.out.println("Incerc "+parola);
            if (modulLogin.login("admin",parola)){
                System.out.println("Am gasit parola: " +parola);
            }
        }

        System.out.println("--------------------\n");
        //login cu proxy
        ProxyModulLogin proxyModulLogin = new ProxyModulLogin(modulLogin);
        for (String parola:dictionarParole){
            System.out.println("Incerc "+parola);
            if (proxyModulLogin.login("admin",parola)){
                System.out.println("Am gasit parola: " +parola);
            }
        }

    }
}
