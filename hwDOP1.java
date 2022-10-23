package com.samsung;

import java.util.Scanner;

public class hwDOP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = 1;
        int t=n;
        while(n>0){
            n/=2;
            len+=1;
        }
        int a[] = new int[len];
        for (int i = 0; i < a.length-1; i++) {
            a[i]=t%2;
            t/=2;
            System.out.print(a[i]);

        }
    }
}