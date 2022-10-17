package com.samsung;
import java.util.Scanner;
public class hw6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a  = scanner.nextInt();
        int min = (a/60)%60;
        int hour = a/(60*60);
        int sec = a%60;
        System.out.println(hour%24+":"+min/10+min%10+":"+sec/10+sec%10);
    }
}
