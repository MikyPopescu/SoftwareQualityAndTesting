package ro.ase.csie.cts.varianta1.designpatterns.decorator.clase;

public class DecoratorConcretNumarTelefon extends DecoratorAbstractClient{
    private String numarTelefon;

    public DecoratorConcretNumarTelefon(IActiuniEmail client, String numarTelefon) {
        super(client);
        this.numarTelefon= numarTelefon;

    }

    @Override
    public void trimiteEmail(IActiuniEmail destinatie, String subject) {
        System.out.println("Numarul de telefon al clientului este " + numarTelefon);
        super.trimiteEmail(destinatie, subject);
    }

}
