package com.samsung;

import java.util.Scanner;

public class hwDOP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 1;
        for (int i = 1; i <= n; i++) {
            t*=i;
        }
        System.out.print(t);
    }

}