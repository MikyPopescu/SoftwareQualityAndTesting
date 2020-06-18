package cts.popescu.mihaela.g1082.patternComposite;

public class TestComposite {
    public static void main(String[] args) {

        IActiuniEmail client1 = new Client(1,"Client 1", "client1@gmail.com", 1234);
        IActiuniEmail client2 =  new Client(2,"Client 2", "client2@gmail.com", 1234);
        IActiuniEmail client3 =  new Client(3,"Client 3", "client3@gmail.com", 1234);
        IActiuniEmail client4 =  new Client(4,"Client 4", "client4@gmail.com", 1234);


        IActiuniEmail grup1 = new GrupClienti(100,"grup1",10000);
        IActiuniEmail grup2 = new GrupClienti(200,"grup2",10000);
        IActiuniEmail grup3 = new GrupClienti(300,"grup3",10000);

        grup1.adauga(client1);
        grup2.adauga(client2);
        grup2.adauga(grup1);
        grup3.adauga(grup2);
        grup3.adauga(client3);
        grup3.adauga(client4);


        grup3.trimiteEmail( new Client(1000,"Destinatar","miky@miky.com", 100), "subiect");


    }
}
