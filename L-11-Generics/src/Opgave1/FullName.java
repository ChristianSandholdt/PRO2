package Opgave1;

public class FullName implements Comparable<FullName> {

    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public int compareTo(FullName o) {
        if (this.lastName.compareTo(o.lastName) != 0){
            return this.lastName.compareTo(o.lastName);
        } else return this.firstName.compareTo(o.firstName);
    }
}
