package com.samsung;

import java.util.Scanner;

public class hw4 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int a = 4;
        for (int i = 0; i < arr.length; i+=1) {
            System.out.print(a+" ");
            a+=3;
        }
    }
}