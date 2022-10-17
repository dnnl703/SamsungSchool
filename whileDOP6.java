package com.samsung;
import java.util.Scanner;
public class whileDOP6{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int ans = 0;
        int count = 0;
        while (a>0) {
            if(a%10==a/10%10){
                count+=1;}
            a/=10;
        }
        if(count>0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}