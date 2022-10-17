package com.samsung;
import java.util.Scanner;
public class hwDOP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double pi = Math.PI;
        double sin = Math.sin(x);
        System.out.print((y<sin&&y>0&&x<pi&&x>0&&y<0.5) ? "YES" : "NO");
    }

}