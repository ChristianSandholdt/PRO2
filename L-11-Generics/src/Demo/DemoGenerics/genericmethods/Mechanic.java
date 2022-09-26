package Demo.DemoGenerics.genericmethods;

public class Mechanic extends Person {
	private final int wage; // hourly wage in DKR

	public Mechanic(String name, int wage) {
		super(name);
		this.wage = wage;
	}

	public int getWage() {
		return wage;
	}

	@Override
	public String toString() {
		return String.format("%s (%d kr)", super.toString(), wage);
	}
}
