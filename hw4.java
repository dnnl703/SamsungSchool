package com.samsung;

import java.util.Scanner;
public class hw4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a  = scanner.nextInt();
        System.out.println(a/100>0&&a/100<10&&a%5==0);
    }
}