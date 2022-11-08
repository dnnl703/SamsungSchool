package com.samsung;

import com.samsung.model.Animal;

public class App {
    public static void main(String[] args) {
    Animal animal1 = new Animal("Шарик","Вася", "овчарка");
    animal1.printInfo();
    Animal animal2 = new Animal("Кубик","Петя", "Ретривер");
    animal2.printInfo();
    }
}
