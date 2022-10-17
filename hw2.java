package com.samsung;

import java.util.Scanner;
    public class hw2 {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            float a  = scanner.nextFloat();
            System.out.println((a>=-3 && a<=5)||(a>=9&&a<=15));
        }
    }