package com.samsung;

import java.util.Scanner;

public class hw4 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        if (n % 100 > 9 && n % 100 < 20 || n % 10 > 4 || n == 0) {
            System.out.println(n + " TORTOV");
        }
        else if (n % 10 == 1) {
            System.out.println(n + " TORT");
        }

        else {
            System.out.println(n + " TORTA");
        }
    }
}