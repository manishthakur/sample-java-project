package org.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnitOneExercise {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Manish", "Thakur", 30), new Person("Neelam", "Kumari", 40), new Person("Yashika", "Thakur", 50));

        // Step 1. Sort list by last Name
        Collections.sort(personList, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2.  method to print all name
        printAll(personList);

        // Step 3. method to print all tha have last name beginning with C
        printConditionally(personList, p -> p.getLastName().startsWith("T"));
        printConditionally(personList, p -> p.getLastName().startsWith("K"));
        printConditionally(personList, p -> p.getFirstName().startsWith("N"));
    }

    private static void printAll(List<Person> personList) {
        personList.forEach(System.out::println);
    }

    private static void printConditionally(List<Person> personList, Condition condition) {
        personList.stream().filter(condition::test).forEach(System.out::println);
    }

    @FunctionalInterface
    interface Condition {
        boolean test(Person p);
    }
}
