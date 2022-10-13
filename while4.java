
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        int a = in.nextInt(), b = in.nextInt();
        int res = 0;
        while (a >= b){
            a -= b;
            res += 1;
    }
        System.out.print(res+" ");
        System.out.println(a);
    }
}