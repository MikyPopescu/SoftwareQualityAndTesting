package cts.g1082.popescu.mihaela.patternCommand;

public class TestCommand {
    public static void main(String[] args) {


        System.out.println("Nicio solicitare");

        ManagerReparatii managerReparatii = new ManagerReparatii();
        System.out.println("Lansare solicitare electrician");
        managerReparatii.adaugaRezolvare(new RezolvareProblema("Gigel", "A10", 120, "nu merge priza", new ModulElectricieni()));
        System.out.println("Lansare solicitare electrician");
        managerReparatii.adaugaRezolvare(new RezolvareProblema("Gigel", "A12", 122, "nu merge intrerupatorul", new ModulElectricieni()));
        System.out.println("Lansare solicitare instalator");
        managerReparatii.adaugaRezolvare(new RezolvareProblema("Dorel", "A10", 120, "s-a spart teava", new ModulInstalatori()));
        System.out.println("Lansare solicitare instalator");
        managerReparatii.adaugaRezolvare(new RezolvareProblema("Dorel", "A11", 121, "s-a stricat apa calda", new ModulInstalatori()));


        System.out.println("Nicio solicitare");
        managerReparatii.reparaProblemaInBloc("A10",120,"nu merge priza");

    }
}
