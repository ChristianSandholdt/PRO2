package Demo.DemoGenerics.genericmethods;

public class Person implements Comparable<Person> {
	private final String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person p) {
		return this.name.compareTo(p.name);
	}

}
