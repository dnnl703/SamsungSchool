package com.samsung;
import java.util.Scanner;
public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int a[] = new int[len];
        int num;
        int countchet = 0;
        int sum=0;
        for (int i=0; i < len; i++) {
            num = sc.nextInt();
            a[i]+=num;
            if (a[i]%2==0) {
                countchet+=1;
                sum+=a[i];
            }
        }
        if(countchet>0){
            System.out.print(sum);}
        else
            System.out.print("NO");
    }
}