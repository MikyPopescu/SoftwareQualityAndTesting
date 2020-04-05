package ro.ase.csie.cts.seminar1.exceptii;

public class ExceptieTransferIlegal extends Exception {

    //pentru personalizarea mesajului (getMessage)
    public ExceptieTransferIlegal(String mesaj) {
        super(mesaj);
    }

    //dau posibilitatea sa trimit exceptii si fara mesaj
    public ExceptieTransferIlegal() {
        super();
    }
}
