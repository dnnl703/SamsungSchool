package com.samsung;
import java.util.Scanner;
public class CW {
        public static void main(String[] args) {
            int[] a = {3, 5, 7, 9};
            rotRight(a);
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");

            }
        }
        public static int[] rotRight(int[] a){
            int t = a[a.length-1];
            for (int i=a.length-1; i>=1; i--){
                a[i]=a[i-1];
            }a[0]=t;
            for (int i=1; i<a.length; i++){
            }
            return a;
        }
    }

