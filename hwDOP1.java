package com.samsung;

import java.util.Scanner;

public class hwDOP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.print((x * x + y * y > 4 && y < x && x < 2 &&y>0)?"YES":"NO");
    }

}