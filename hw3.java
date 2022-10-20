package com.samsung;
import java.util.Scanner;
public class hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sumOfThirteen(n));
    }
    public static int  sumOfThirteen(int n){
        int sum = 0;
        int count = 0;
        for (int i =0; i < n; i++) {
            sum=0;
            int t = i;
            while(t>0){
                sum+=t%10;
                t/=10;
            }
            if (sum%13==0){
                count+=1;
            }

        }
        return count;
    }

}
