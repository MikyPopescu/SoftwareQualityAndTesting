package ro.ase.csie.cts.varianta1.designpatterns.decorator.clase;
import java.util.Date;

public interface IActiuniEmail {
	public void trimiteEmail(IActiuniEmail destinatie, String subject);
	public void creareEmailDraft(String subject, int prioritate);
	public String getEmail();
	public void trimiteEveniment(
			Date dataEveniment, 
			IActiuniEmail destinatie,
			String subject);


}
