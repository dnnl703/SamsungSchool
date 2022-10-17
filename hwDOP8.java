package com.samsung;

import java.util.Scanner;

public class hwDOP8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.print(((y>x-1&&y<1&&x>0)||(x*x+y*y<1&y<x-1)) ? "YES" : "NO");
    }

}
