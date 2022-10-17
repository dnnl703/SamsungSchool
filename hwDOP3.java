package com.samsung;

import java.util.Scanner;

public class hwDOP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.print(a%10+a/10%10+a/100%10);
    }
}
