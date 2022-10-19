package com.samsung;
import java.util.Scanner;
public class hw6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int a[] = new int[len];
        int num;
        int maxCount = 1;
        int count = 0;
        int maxCountInt = a[0];
        for (int i = 0; i < len; i++) {
            num = sc.nextInt();
            a[i] += num;
        }
        for (int i = 0; i < a.length; i++) {
            count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])
                    count++;
                if (count > maxCount) {
                    maxCount = count;
                    maxCountInt = a[i];
                }
            }
        }if (maxCount>1)
            System.out.println(maxCountInt);
        else
            System.out.print(a[0]);
    }
}