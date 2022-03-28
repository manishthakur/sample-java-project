package org.lambdas.unit3;

import org.lambdas.Person;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Manish", "Thakur", 30),
                new Person("Neelam", "Kumari", 40),
                new Person("Yashika", "Thakur", 50));

        personList.stream()
                .filter(p -> p.getLastName().startsWith("T"))
                .forEach(p -> System.out.println(p.getFirstName()));
    }
}
