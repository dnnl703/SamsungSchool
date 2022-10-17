package com.samsung;

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.print(a+2-(a%2));
    }
}