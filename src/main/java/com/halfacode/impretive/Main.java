package com.halfacode.impretive;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.halfacode.impretive.Main.Gender.FEMALE;
import static com.halfacode.impretive.Main.Gender.MALE;

public class Main {

    public static void main(String[] args) {
        List<Person> people= List.of(
                new Person("Jphn", MALE),
                new Person("TAREG", MALE),
                new Person("AHMED", MALE),
                new Person("ASHA", FEMALE)
        );

        List<Person> females= new ArrayList<>();
        for (Person person: people){
           if (FEMALE.equals(person.gender)){
               females.add(person);
           }
        }
        for (Person female: females) {
            System.out.println(female);

        }
        //delcarative approach
        System.out.println("delcarative approach");
       /* people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                //.collect(Collectors.toList())
                .forEach(System.out::println);*/
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                //.collect(Collectors.toList())
                .forEach(System.out::println);
    }

    static class Person{

        private final String name;
        private final Gender gender;

        Person(String name1, Gender gender1) {
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
