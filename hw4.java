package com.samsung;

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0 && b <= 0 || a == 0 && b == 0 || a < 0 && b < 0 || b == 0 && a < 0)
            System.out.println("no such x");
        else if (b > 0 && a > 0 || a == 0 && b > 0 || b == 0 && a > 0)
            System.out.println("any x");
        if (a > 0 && b < 0) {
            double n1 =(double) b/a;
            double n2 = (double)-b/a;
            String num1 = String.format("%.1f", n1);
            String num2 = String.format("%.1f", n2);
            System.out.println("x<" + num1 + " or x>" + num2);
        } else if (a < 0 && b > 0) {
            double n1 = (double) b/a;
            double n2 = (double)-b/a;
            String num1 = String.format("%.1f", n1);
            String num2 = String.format("%.1f", n2);
            System.out.println(num1 + "<x<" + num2);
        }
    }
}
