package com.company;

class Teacher extends Person {
    private String faculty;

    Teacher(String firstName, String lastName, int age, String faculty) {
        super(firstName, lastName, age);
        this.faculty = faculty;
    }

    void showTeacher() {
        System.out.print(faculty + ", ");
        super.showPerson();
    }

    String showUser() {
        return "ololo";
    }
}
