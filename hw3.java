package com.samsung;
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.print(a%10+(a/10)%10+(a/100)%10);
    }
}