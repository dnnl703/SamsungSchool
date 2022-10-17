package com.samsung;

import java.util.Scanner;
public class whileDOP2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int num = a;
        int count = 1;
        while (count < Math.abs(b)) {
            count += 1;
            a += num;
        }
        if (b < 0)
            System.out.println(-a);
        else if (num == 0 || b == 0)
            System.out.println(0);
        else
            System.out.println(a);

    }
}
