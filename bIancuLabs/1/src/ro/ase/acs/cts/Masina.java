package ro.ase.acs.cts;

public class Masina extends Vehicul implements Impozabil {
    //Eroare la definire:
    //Solutie 1: fac clasa abstracta
    //Solutie 2: implementez metodele din Vehicul si Impozabil (supradefinire)
    //suprascriere: supraincarcare + supradefinire

    //Eroare la constructorul default la Vehicul:
    //Cand incerc sa fac o Masina, va cauta sa apeleze un constructor din parinte
    //constructorul default din Masina (care exista implicit daca nu am scris nimic) va cauta sa apeleze constructorul default din Vehicul care nu exista (constructorul cu parametrii anuleaza constructorul implicit default)
    //Un constructor cu parametrii, il anuleaza pe cel implicit fara parametrii

    private int capacitateCilindrica;
    //Enum: innner sau in alt fisier
    private TipCombustibil combustibil;

    public Masina(int viteza, String denumire, int capacitateCilindrica) {
        super(viteza, denumire);
        this.capacitateCilindrica = capacitateCilindrica;
    }

    @Override
    public float calculeazaImpozit() {
        if (capacitateCilindrica < 2000) {
            return (float) capacitateCilindrica / 1000 * 50;
        } else {
            return (float) capacitateCilindrica / 1000 * 100;
        }
    }

    @Override
    //adnotarea e pt verificare la executie, merge si daca o sterg (se uita spre ce pointeaza obiectul), verifica la compilare daca exista o metoda "deplasare" pe care pot s-o supradefinesc
    public void deplasare() {
        //sout
        System.out.println("Masina se deplaseaza");
    }

    public TipCombustibil getCombustibil() {
        return combustibil;
    }

    public void setCombustibil(TipCombustibil combustibil) {
        this.combustibil = combustibil;
    }
}
