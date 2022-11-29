package com.samsung;

public class Student extends User implements Printer{
    private String group;

    public String getGroup() {
        return group;
    }

    @Override
    void sayHello() {
        System.out.println("Привет, я студент, мое имя " + getName());
    }
    public Student(String group, String name,String sername,String patronymic){
        super(name, sername, patronymic);
        this.group = group;
    }
    public Student(Student student){
            super(student.name, student.sername, student.patronymic, student.number);
            this.group = student.group;
    }

    public Student(String group, String name,String sername,String patronymic, String number){
        super(name, sername, patronymic,number);
        this.group = group;
    }

    @Override
    public void printInfo() {
        StringBuilder str = new StringBuilder();
            str.append("Student:\n")
                    .append("name - "  + name)
                    .append("\n")
                    .append("sername - " + sername)
                    .append("\n")
                    .append("patronymic - " + patronymic)
                    .append("\n")
                    .append("group - " + group)
                    .append("\n")
                    .append("number - "+number)
                    .append("\n");;


        System.out.print(str.toString());
    }
}
