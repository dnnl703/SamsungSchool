package com.samsung;
import java.util.Scanner;
public class whileDOP7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i = 1;
        int count = 0;
        while (i<a/2) {
            i+=1;
            if (a%i==0)
                count+=1;
        }
        if (a==2||a==3||count==0)
            System.out.println("prime");
        else
            System.out.println("composite");
    }
}