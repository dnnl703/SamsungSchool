package com.samsung;

import java.util.Scanner;

public class hwDOP7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.print((y > 1 - x && x < 1) && (y > 2 * x * x || y < 2 * x * x && x > 0) ? "YES" : "NO");
    }

}