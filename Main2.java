import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mid;
        int max = Math.max(Math.max(a,b),c);
        int min = Math.min(Math.min(a,b),c);
        mid = a+b+c-max-min;

        System.out.println( min + " " + mid + " " + max);
    }
}