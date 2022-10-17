package com.samsung;

import java.util.Scanner;

public class hwDOP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.print((y<2-x*x && ( y >x || y < x && y>0)) ? "YES" : "NO");
    }

}
