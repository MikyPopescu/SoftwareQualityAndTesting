package cts.popescu.mihaela.g1082.patternDecorator;

public class DecoratorPrioritate  extends DecoratorClienti{
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
