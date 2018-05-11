package com.company;

public class Main {

    public static void main(String[] args) {
//        Person person = new Person("Jack", "Wood", 13);
//        person.showPerson();
        System.out.println(Student.count);
        Student student = new Student("Haley", "Matters", 12, "Group1");
        student.showStudent();
        Student student2 = new Student("Hank", "Matters", 22, "Group2");
        Student student3 = new Student("Hover", "Matt", 32, "Group3");
        Student.showCounter();
        System.out.println(student.showUser());
    }
}
