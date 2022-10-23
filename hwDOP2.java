package com.samsung;
import java.util.Scanner;
public class hwDOP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n-1];
        int b[] = new int[n];
        int count = 0;
        for (int i = 0; i <n-1; i++) {
            a[i]+= sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i]+= i+1;
        }
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n-1; j++) {
                if(a[j]==b[i]){
                    count+=1;
                    break;
                }
            }
            if (count == 0){
                System.out.print(b[i]);
                break;
            }
        }
    }
}