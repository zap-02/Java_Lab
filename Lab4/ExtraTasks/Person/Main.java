package ExtraTaskLab4;

import java.util.HashSet;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice",25);
        Person person2 = new Person("Alice",25);

        System.out.println("Equals: "+ person1.equals(person2));
        System.out.println("Hashcode: " + (person1.hashCode() == person2.hashCode()));
        Set<Person> set = new HashSet<>();
        set.add(person1);
        set.add(person2);
        System.out.println("Set.size: " + set.size());

    }
}
