package com.samsung;
import java.util.Scanner;
public class hw5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int a[] = new int[count];
        int num;
        for (int i = 0; i < count; i++) {
            num = sc.nextInt();
            a[i] += num;
        }
        System.out.print(avgOf4Digit(a));

    }

    public static double avgOf4Digit(int mas[]) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i]>=1000&&mas[i]<10000){
                sum += mas[i];
                count += 1;}
        }
        if (count>0){
            return (double)sum/count;
    }
        else return -1.0;
    }
}

