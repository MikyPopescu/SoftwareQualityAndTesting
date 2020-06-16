package cts.patterns.miky.implementation;

public class FacadeApartament {
    Fereastra fereastra;
    MasinaDeSpalat masinaSpalat;
    RobinetApa robinet;
    UsaLocuinta usa;

    public FacadeApartament(Fereastra fereastra, MasinaDeSpalat masinaSpalat, RobinetApa robinet, UsaLocuinta usa) {
        this.fereastra = fereastra;
        this.masinaSpalat = masinaSpalat;
        this.robinet = robinet;
        this.usa = usa;
    }

    public void inchideCasa(){
        this.fereastra.inchide();
        this.masinaSpalat.opreste();
        this.robinet.inchide();
        this.usa.inchide();
    }

    public void pornesteMasinaDeSpalat(){
        this.robinet.deschide();
        this.masinaSpalat.porneste();
    }
}
