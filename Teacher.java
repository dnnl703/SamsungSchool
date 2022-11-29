package com.samsung;

public class Teacher extends User implements Printer {


    private String[] subjects;

    public Teacher(String name, String sername, String patronymic, String subject) {
        super(name, sername, patronymic);

    }
    public Teacher(String name, String sername, String patronymic, String[] subject,String number) {
        super(name, sername, patronymic);

        this.number = number;
        this.subjects = subject;
    }
    public Teacher(String name, String sername, String patronymic, String[] subject) {
        super(name, sername, patronymic);

        this.subjects = subject;
    }

    @Override
    void sayHello() {
        System.out.println("Здравствуйте, я преподаватель, мое имя " + getName());
    }
    public Teacher(Teacher teacher){

        super(teacher.name, teacher.sername, teacher.patronymic, teacher.number);
        this.subjects = teacher.subjects;
    }

    @Override
    public void printInfo() {
        StringBuilder str = new StringBuilder();
            str.append("Teacher:\n")
                    .append("name - " + name)
                    .append("\n")
                    .append("sername - " + sername)
                    .append("\n")
                    .append("patronymic - " + patronymic)
                    .append("\n")
                    .append("number - "+number)
                    .append("\n");
            str.append("subjects - ");
        for (int i = 0; i < subjects.length; i++) {
            str.append(subjects[i]+" ");
        }
        System.out.println(str.toString());
    }
}
