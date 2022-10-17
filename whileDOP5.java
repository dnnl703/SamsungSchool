package com.samsung;
import java.util.Scanner;
public class whileDOP5  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int ans = 0;
        while (a>0) {
            ans+=a%10;
            a/=10;
        }
        System.out.println(ans);
    }
}