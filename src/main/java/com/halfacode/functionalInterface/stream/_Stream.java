package com.halfacode.functionalInterface.stream;


import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static com.halfacode.functionalInterface.stream._Stream.Gender.FEMALE;
import static com.halfacode.functionalInterface.stream._Stream.Gender.MALE;


public class _Stream {

    public static void main(String[] args) {
        List<Person> people= List.of(
                new Person("Jphn", MALE),
                new Person("TAREG", MALE),
                new Person("AHMED", MALE),
                new Person("ASHA", FEMALE)
        );

        Predicate<Person> personPredicate=person ->  FEMALE.equals(person.gender);
        boolean containOnlyFemale = people.stream()
                .anyMatch(personPredicate);
        System.out.println(containOnlyFemale);

      /*  people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
               //.forEach(gender -> System.out.println(gender));
                .forEach(System.out::println);*/
      /*  people.stream()
                .map(person -> person.name)
                .collect(Collectors.toSet())
                .forEach(System.out::println);*/

       /* people.stream()
                .map(person -> person.name)
                .mapToInt(name -> name.length())
                .forEach(System.out::println);*/

       /* Function<Person, String> personStringFunction= person -> person.name;
        ToIntFunction<String> length= String::length;
        IntConsumer printLn= System.out::println;

        people.stream()
                .map(personStringFunction)
                .mapToInt(length)
                .forEach(printLn);*/

    }
    static class Person{

        private final String name;
        private final _Stream.Gender gender;

        Person(String name1, _Stream.Gender gender1) {
            this.name = name1;

            this.gender = gender1;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }
}
