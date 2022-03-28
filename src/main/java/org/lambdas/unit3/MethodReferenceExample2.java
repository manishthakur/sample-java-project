package org.lambdas.unit3;

import org.lambdas.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    //TODO
    // Check all functional interface

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Manish", "Thakur", 30),
                new Person("Neelam", "Kumari", 40),
                new Person("Yashika", "Thakur", 50));

        // Step 1. Sort list by last Name
        Collections.sort(personList, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2.  method to print all name
        //printAll(personList);

        // Step 3. method to print all tha have last name beginning with C
        //printConditionally(personList, p -> p.getLastName().startsWith("T"), p -> System.out.println(p));
        //printConditionally(personList, p -> p.getLastName().startsWith("K"), p -> System.out.println(p.getFirstName()));
        printConditionally(personList, p -> p.getFirstName().startsWith("N"), System.out::println);
    }

    private static void printAll(List<Person> personList) {
        personList.forEach(System.out::println);
    }

    private static void printConditionally(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer) {
        personList.stream().filter(predicate::test).forEach((p) -> consumer.accept(p));
    }

    @FunctionalInterface
    interface Condition {
        boolean test(Person p);
    }
}
