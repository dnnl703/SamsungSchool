package com.samsung.model;

public class Animal {

    private String name;
    private String ownerName;
    private String type;

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getType() {
        return type;
    }



    public Animal(String name, String ownerName,String type){
        this.name = name;
        this.ownerName = ownerName;
        this.type = type;
    }

    public void printInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("name: ")
                .append(name+"\n")
                .append("ownerName: ")
                .append(ownerName+"\n")
                .append("type: ")
                .append(type)
                .append("\n");

        System.out.print(stringBuilder.toString());

    }

}
