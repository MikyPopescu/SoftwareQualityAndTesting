package ro.ase.csie.acs.cts.seminar12.adapter;
//similitudine cu CaracterACME
public abstract class CaracterDisney {
    protected String denumire;
    protected float nivelEnergie;

    public CaracterDisney(String denumire, float nivelEnergie) {
        this.denumire = denumire;
        this.nivelEnergie = nivelEnergie;
    }


    public String getDenumire() {
        return denumire;
    }
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
    public float getNivelEnergie() {
        return nivelEnergie;
    }
    public void setNivelEnergie(float nivelEnergie) {
        this.nivelEnergie = nivelEnergie;
    }


    public abstract void interactioneaza(float energie);
    public abstract void resetareEnergie();
}
