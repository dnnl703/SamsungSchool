package com.samsung;
import java.util.Scanner;
public class whileDOP1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int high;
        int count=1;
        String str;
        while (count<a+1) {
            high = in.nextInt();
            if (high<437){
                str = String.format("Crash %s", count);
                System.out.println(str);
                break;
            }
            count+=1;
        }
        if(count==a+1)
            System.out.println("No crash");

    }
}