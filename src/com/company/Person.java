package com.company;

abstract class Person {
    private int age;
    private String firstName;
    private String lastName;

    Person(String firstName, String lastName, int age) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void showPerson() {
        System.out.println(age + ", " + firstName + ", " + lastName);
    }

    abstract String showUser();
}
