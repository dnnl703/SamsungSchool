package com.samsung;

public class University implements Printer {
    private Student[] students;
    private Teacher[] teachers;
    private String adress;

    public University(Student[] students, Teacher[] teachers, String adress){
        this.students = students;
        this.teachers = teachers;
        this.adress = adress;
    }

    @Override
    public void printInfo(){
        for (int i = 0; i < students.length; i++) {
            students[i].printInfo();
        }
        for (int i = 0; i < teachers.length; i++) {
            teachers[i].printInfo();
        }
        System.out.print(adress);
    }
}
