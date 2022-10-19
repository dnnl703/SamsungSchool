package com.samsung;
import java.util.Scanner;
public class hw5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int a[] = new int[count];
        int num;
        for (int i=0; i < count; i++) {
            num = sc.nextInt();
            a[i] += num;
        }
        for (int i=count-1; i >=0 ; i--) {
            System.out.print(a[i]);
        }
    }
}
