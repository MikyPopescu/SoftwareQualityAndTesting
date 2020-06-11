package command;

public class ComandaInternare implements IComanda{

	private Medic medic;
	private String pacient;
	
	public ComandaInternare(Medic medic, String pacient) {
		super();
		this.medic = medic;
		this.pacient = pacient;
	}

	@Override
	public void executa() {
		this.medic.internare(this.pacient);
		
	}

}
