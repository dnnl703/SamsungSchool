package com.samsung;
import java.util.Scanner;
public class hw5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.print(a == b*-1 || a == c*-1 || a == d*-1 || b == c*-1 || b == d*-1 || c == d*-1);
    }

}