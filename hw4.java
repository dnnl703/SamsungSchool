package com.samsung;
import java.util.Scanner;
public class hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        binFraction(x, n);
    }
    public static void binFraction(double x, int n){
        for (int i = 0; i < n; i++) {
            x*=2;
            System.out.print((int)x);
            x-=(int)x;

        }
        }

}