package com.samsung;
import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.print(a*n+(b*n/100)%10000);
        System.out.print(' ');
        System.out.print(((b*n)%100));
    }
}