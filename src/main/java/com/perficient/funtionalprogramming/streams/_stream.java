package com.perficient.funtionalprogramming.streams;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Brayan", Gender.MALE),
                new Person("Alice", Gender.FEMALE),
                new Person("Bob", Gender.PREFER_NOT_TO_SAY)
        );

      
        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        
        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        
        //another used to Streams
        //Using Predicates
        Predicate<Person> containsOnlyFemalesPredicate = 
                person -> Gender.FEMALE.equals(person.gender);
       
        
        boolean containsOnlyFemales = people.stream()
                .anyMatch(person -> Gender.FEMALE.equals(person.gender));
        
        System.out.println(containsOnlyFemales);
        
      


         
         
                         
                         

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
        MALE, FEMALE, PREFER_NOT_TO_SAY;
    }

}
