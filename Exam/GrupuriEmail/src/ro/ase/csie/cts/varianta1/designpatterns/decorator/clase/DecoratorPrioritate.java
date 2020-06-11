package ro.ase.csie.cts.varianta1.designpatterns.decorator.clase;

public class DecoratorPrioritate extends DecoratorAbstractClient {
    public DecoratorPrioritate(IActiuniEmail client) {
        super(client);

    }

    @Override
    public void creareEmailDraft(String subject, int prioritate) {

        super.creareEmailDraft(subject, prioritate);
        if(prioritate == 1) {
            System.out.println("Email-ul trebuie trimis urgent!!");

        }
    }

}
