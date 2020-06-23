package cts.g1082.popescu.mihaela.patternCommand;

public abstract class SolicitareRezolvareProblema {
	
	String numeMeserias;

	public SolicitareRezolvareProblema(String numeMeserias) {
		this.numeMeserias = numeMeserias;
	}

	public abstract void reparaProblemaInBloc(String numarBloc, int numarApartament, String problema);
}
