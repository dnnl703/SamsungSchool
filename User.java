package com.samsung;

public abstract class User {
    protected String name;
    protected String sername;
    protected String patronymic;
    protected String number;

    abstract void sayHello();

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSername() {
        return sername;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }
    public User( String name,String sername,String patronymic){
        this.name = name;
        this.sername = sername;
        this.patronymic = patronymic;
    }
    public User( String name,String sername,String patronymic,String number){
        this.name = name;
        this.sername = sername;
        this.patronymic = patronymic;
        this.number = number;
    }
}
