package ro.ase.csie.acs.cts.seminar9.singleton;

/*
 *
 * In cadrul solutiei trebuie permisa o singura/unica a clasei ContJucator
 * Toate modulele trebuie sa foloseasca acest unic modul
 * Nu este permisa crearea de obiecte multiple de tipul ContJucator
 *
 */

public class ContJucator {
    //gestioneaza obiectul unic
    private static ContJucator referintaObiectUnic = null;

    String utilizator;
    String parola;
    float resurse;
    String email;
    String[] caractereJoc;

    private ContJucator(String utilizator, String parola) {
        this.utilizator = utilizator;
        this.parola = parola;

        System.out.println("Autentificare jucator...");
        System.out.println("Incarcare profil jucator...");
    }

    private ContJucator() {
        System.out.println("Se preiau datele utilizatorului din setarile clientului");
        this.utilizator="Superman";
        this.parola="123456";
    }

    @Override
    public String toString() {
        return String.format("Jucator cu numele %s", this.utilizator);
    }

    //metoda prin care furnizam referinta catre obiectul unic
    //intoarce o referinta de ContJucator
    //varianta cu constructor default
//    public static ContJucator getJucator() {
//        if (ContJucator.referintaObiectUnic == null) {
//            //obiectul inca nu a fost creat
//            System.out.println("Creare obiect unic - singleton");
//            ContJucator.referintaObiectUnic = new ContJucator();
//        }
//        return referintaObiectUnic;
//    }

    //varianta cu parametrii
    public static ContJucator getJucator(String utilizator, String parola) throws ExceptieCreareJucator {
        if (ContJucator.referintaObiectUnic == null) {
            //obiectul inca nu a fost creat
            System.out.println("Creare obiect unic - singleton");
            ContJucator.referintaObiectUnic = new ContJucator(utilizator, parola);
        } else {
            if (!utilizator.equals(ContJucator.referintaObiectUnic.utilizator)) {
                throw new ExceptieCreareJucator();
            }
        }
        return referintaObiectUnic;
    }

    //datele sunt preluate din alta sursa
    public static ContJucator getJucator(){
        if(ContJucator.referintaObiectUnic==null){
            ContJucator.referintaObiectUnic=new ContJucator();
        }
        return ContJucator.referintaObiectUnic;
    }
}
