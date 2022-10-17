package com.samsung;

import java.util.Scanner;

public class hwDOP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.print((y>x*x-2 && ( y <-x || y < x)) ? "YES" : "NO");
    }

}