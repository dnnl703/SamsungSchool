package com.samsung;
import java.util.Scanner;
public class hw6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mas[] = new int[n];
        for (int i = 0; i < mas.length; i++) {
            int num=sc.nextInt();
            mas[i]+=num;
        }
        minToBegin(mas);
    }
    public static int[] minToBegin(int mas[]) {
        int min = 999999;
        int minI = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
                minI = i;
            }
        }
        while (minI >= 1) {
            mas[minI] = mas[minI - 1];
            minI--;
        }
        mas[0] = min;
        return mas;
    }
}