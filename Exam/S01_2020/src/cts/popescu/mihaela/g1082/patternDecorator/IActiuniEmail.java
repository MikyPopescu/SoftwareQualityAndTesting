package cts.popescu.mihaela.g1082.patternDecorator;

import java.util.Date;

public interface IActiuniEmail {
	 void trimiteEmail(Date dataEveniment, IActiuniEmail destinatie, String subject);
	 void creareEmailDraft(String subject, int prioritate);
	 String getEmail();
	 void trimiteEveniment(
			Date dataEveniment, 
			IActiuniEmail destinatie,
			String subject);
}
