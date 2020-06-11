package template;

public abstract class TemplateRetragere {

	protected String nrCard;
	protected int sumaSpecificata;

	public TemplateRetragere(String nrCard) {
		super();
		this.nrCard = nrCard;
	}
	
	public abstract void introducereCard();
	public abstract void introducerePIN(String PIN);
	public abstract void introducereSuma(int suma);
	public abstract int retragereSuma();
	public abstract void retragereCard();
	
	public final int retragereBani(String PIN, int suma) {
		int sumaRetrasa;
		introducereCard();
		introducerePIN(PIN);
		introducereSuma(suma);
		sumaRetrasa = retragereSuma();
		retragereCard();
		
		return sumaRetrasa;
		
	}
}
