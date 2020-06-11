package ro.ase.csie.cts.varianta1.designpatterns.composite.client;

import ro.ase.csie.cts.varianta1.designpatterns.composite.clase.Client;
import ro.ase.csie.cts.varianta1.designpatterns.composite.clase.GrupClienti;
import ro.ase.csie.cts.varianta1.designpatterns.composite.clase.IActiuniEmail;

public class TestComposite {
    public static void main(String[] args) {

        IActiuniEmail client1 = new Client("Client 1", 1000, 1234, "cleisnshs");
        IActiuniEmail client2 = new Client("Client 2", 1000, 1234, "cleisnshs");
        IActiuniEmail client3 = new Client("Client 3", 1000, 1234, "cleisnshs");
        IActiuniEmail client4 = new Client("Client 4", 1000, 1234, "cleisnshs");


        IActiuniEmail grup1 = new GrupClienti("Grup1", 100000, 1234);
        IActiuniEmail grup2 = new GrupClienti("Grup2", 20000, 12345);
        IActiuniEmail grup3 = new GrupClienti("Grup3", 5000, 123);

        grup1.adauga(client1);
        grup2.adauga(client2);
        grup2.adauga(grup1);
        grup3.adauga(grup2);
        grup3.adauga(client3);
        grup3.adauga(client4);


        grup3.trimiteEmail( new Client("Destinatar",122, 1373, "ahshsh@"), "subiect");
    }
}
