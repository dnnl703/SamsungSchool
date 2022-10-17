package com.samsung;
import java.util.Scanner;
public class hw6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(a%2==0&&b%2==0&&c%2==0||a%2==0&&b%2==0||b%2==0&&c%2==0||a%2==0&&c%2==0);
    }

}