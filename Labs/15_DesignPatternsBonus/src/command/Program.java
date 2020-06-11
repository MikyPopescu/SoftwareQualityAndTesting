package command;

public class Program {

	public static void main(String[] args) {
	
		Medic medic = new Medic("Popescu Ioana", "cardiolog");
		Operator operator = new Operator();
		
		operator.invoca(new ComandaInternare(medic, "Vasilescu Ion"));
		operator.invoca(new ComandaTratare(medic, "Gheorghe Viorica"));
		
		operator.executaComanda();
		operator.invoca(new ComandaInternare(medic, "Iordache Silviu"));
		operator.executaComenzi();
	}

}
