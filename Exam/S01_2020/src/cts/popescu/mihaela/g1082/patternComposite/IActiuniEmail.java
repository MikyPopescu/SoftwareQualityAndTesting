package cts.popescu.mihaela.g1082.patternComposite;

import java.util.Date;

public interface IActiuniEmail {

	//metode specifice unui client
	public void trimiteEmail(IActiuniEmail destinatie, String subject);
	public void creareEmailDraft(String subject, int prioritate);
	public String getEmail();
	public void trimiteEveniment(
			Date dataEveniment, 
			IActiuniEmail destinatie,
			String subject);

	//metode specifice grupului
	public void adauga(IActiuniEmail nod);
	public void sterge(int index);
	public IActiuniEmail get(int index);
}
