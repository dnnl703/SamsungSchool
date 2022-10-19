package com.samsung;
import java.util.Scanner;
public class hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int a[] = new int[len];
        int num;
        int countNech = 0;
        int sum=0;
        for (int i=0; i < len; i++) {
            num = sc.nextInt();
            a[i]+=num;
            if (a[i]%2!=0) {
                countNech+=1;
                sum+=a[i];
            }
        }
        if(countNech>0){
        double ans0 = (double)(sum)/(double)(countNech);
        String ans = String.format("%.2f",ans0);
        System.out.print(ans);}
        else
            System.out.print("NO");
    }
}
