package com.perficient.funtionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[]) {
        List<Person> people = List.of(
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Brayan", Gender.MALE),
                new Person("Alice", Gender.FEMALE)
        );
        //Imperative approach

        System.out.println("//Imperative approach");
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for (Person person : females) {
            System.out.println(person);
        }

        //Declarative approach
        System.out.println(" //Declarative approach");
        people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .forEach(System.out::println);

        //Declarative approach
        System.out.println(" //Declarative approach using a Collector");
        List<Person> females2 = people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        females2.forEach(System.out::println);

        //Example using Java Util Funtion Package 
        System.out.println(" //Example using Java Ultil Funtion Package");
        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);
        people.stream()
                .filter(personPredicate)
                .forEach(System.out::println);

    }

    public static class Person {

        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" + "name=" + name + ", gender=" + gender + '}';
        }
    }

    enum Gender {
        MALE, FEMALE;
    }
}
