package com.geekbrains.work8;

import java.util.*;
import java.util.stream.Collectors;





class Person {



    private String name;
    private int age;
    private int rate;


    public Person(String name, int age, int rate) {
        this.name = name;
        this.age = age;
        this.rate = rate;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public static void main(String[] args) {
        Person [] persons = {
                new Person("Andrew", 20, 300),
                new Person("Igor", 23, 350),
                new Person("Ira", 23, 400),
                new Person("Victor", 29, 600)
        };
        double averageRate = Arrays
                .stream(persons)
                .map(Person::getRate)
                .collect(Collectors.averagingInt(o -> o));
        System.out.printf("Средняя зарплата в по отделу %.2f\n", averageRate);

        int n = 3;
        String message = Arrays.stream(persons)
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .limit(n)
                .map(Person::getName)
                .collect(Collectors.joining(" ,"
                        , n + " самых старших сотрудников в отделе зовут "
                        , "."));
        System.out.println(message);
    }
}





