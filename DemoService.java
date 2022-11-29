package com.samsung;

public class DemoService {

    private University university;

    public void demo(){
        Student student = new Student("очная",
                "Вася",
                "Пупкин",
                "Васильевич",
                "880055535");
        Teacher teacher = new Teacher("Федор",
                "Федоров",
                "Михайлович",
                new String[]{"матaн", "физика"});


        Student student1 = new Student("заочная",
                "Петя",
                "Первый",
                "Алексеевич",
                "88005553535");
        Teacher teacher1 = new Teacher("Михаил",
                "Ломоносов",
                "Васильевич",
                new String[]{"естествохание", "химия"},"898008834");

        Student[] students = {student,student1};
        Teacher[] teachers = {teacher, teacher1};

        University university = new University(students,teachers,"кремниевая долина");
        university.printInfo();
        System.out.println();
        student.sayHello();
        student1.sayHello();
        teacher.sayHello();
        teacher1.sayHello();
    }
}
