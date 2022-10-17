package com.samsung;
import java.util.Scanner;
public class hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        String n1 =" TORTOV";
        String n2 = " TORT";
        String n3 =" TORTA";
        if (s==0)
            System.out.println(s+n1);
        else if (s%100>=10 && s%100<=20)
            System.out.println(s+n1);
        else if (s%10==1)
            System.out.println(s+n2);
        else if (s%10>=2 && s%10<=4)
            System.out.println(s+n3);
        else
            System.out.println(s + n1);

    }
}
