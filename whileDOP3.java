package com.samsung;
import java.util.Scanner;
public class whileDOP3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int count = 0;
        int num = 0;
        while (count<a) {
            num+=1;
            if(num%2==0){
                System.out.print(num+" ");
                count+=1;
            }
        }
    }
}