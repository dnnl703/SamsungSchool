package com.samsung;
import java.util.Scanner;
public class hw7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int a[] = new int[len];
        for (int i=0; i < len; i++) {
            int num = sc.nextInt();
            a[i] += num;
        }
        for (int i = 0; i < len; i++) {
            if (a[i]<0){
                System.out.print(a[i]+" ");
            }
            }
        for (int i = 0; i < len; i++) {
            if (a[i]>0){
                System.out.print(a[i]+" ");
        }
}
    }
}