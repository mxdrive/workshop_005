package com.company;

class Student extends Person {
    private String groupNumber;
    static int count;

    Student(String firstName, String lastName, int age, String groupNumber) {
        super(firstName, lastName, age);
        this.groupNumber = groupNumber;
        count++;
    }

    void showStudent() {
        System.out.print(groupNumber + ", ");
        super.showPerson();
    }

    String showUser() {
        return "ololo";
    }

    static void showCounter() {
        System.out.println(count);
    }
}
