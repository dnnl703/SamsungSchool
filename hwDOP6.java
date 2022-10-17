package com.samsung;

import java.util.Scanner;

public class hwDOP6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.print((y * y + x * x < 1 && (x > 0 || y > -x || y < x)) ? "YES" : "NO");
    }

}