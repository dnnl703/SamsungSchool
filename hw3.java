package com.samsung;
import java.util.Scanner;
public class hw3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float a  = scanner.nextFloat();
        System.out.println(a<-2||(a>3&&a<6)||a>9);
    }
}