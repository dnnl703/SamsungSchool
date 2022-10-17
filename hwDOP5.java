package com.samsung;

import java.util.Scanner;

public class hwDOP5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.print((((y < 1 && y > -1) && (x > -1 && x < 0) || (y > x && y < 1)) && x * x + y * y < 1) ? "YES" : "NO");
    }

}
