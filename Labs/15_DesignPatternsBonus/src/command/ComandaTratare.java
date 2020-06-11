package command;

public class ComandaTratare implements IComanda {

	private Medic medic;
	private String pacient;
	
	public ComandaTratare(Medic medic, String pacient) {
		super();
		this.medic = medic;
		this.pacient = pacient;
	}
	@Override
	public void executa() {
		this.medic.tratareImediata(this.pacient);
		
	}

}
