package com.samsung;
import java.util.Scanner;
public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(sumOfSeven(n,b));
    }
    public static int  sumOfSeven(int a, int b){
        int sum = 0;
        for (int i =a; i < b; i++) {
            int t = i;
            if (i%7==0&&i>9&&i<100){
                sum+=t%10+t/10;
            }

        }
        return sum;
    }

}
