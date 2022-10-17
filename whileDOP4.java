package com.samsung;
import java.util.Scanner;
public class whileDOP4  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int i = 10000;
        int count =0;
        while (i < 100000) {
            if (i % a == b && i % c == d){
                System.out.print(i + " ");
                count+=1;}
            i += 1;
        }
        if (count == 0)
            System.out.println(-1);
    }
}