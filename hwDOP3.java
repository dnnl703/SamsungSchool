package com.samsung;

import java.util.Scanner;

public class hwDOP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n*n];
        for (int i = 0; i < a.length; i++) {
            a[i]+=i;
            }
        for (int i = 1; i < a.length; i+=n) {
            System.out.print(a[i]+" ");
            i++;
        }
        System.out.print(n*n);
            }

        }
