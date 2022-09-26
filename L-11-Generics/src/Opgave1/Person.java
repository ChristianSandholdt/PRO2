package Opgave1;

public class Person<T extends Comparable<T>> implements Comparable<Person<T>>{

    private final T name;
    private int age;

    public Person(T name, int age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(Person<T> o) {
        return name.compareTo(o.name);
    }

}
