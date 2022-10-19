package com.samsung;
import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int a[] = new int[count];
        int num;
        for (int i=0; i < count; i++) {
            num= sc.nextInt();
            a[i]+=num;
            }
    }
}