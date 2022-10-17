
import java.util.Scanner;

public class while6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int begin = 26;
        while(n>begin)
        {
            sum+=begin;
            begin+=2;
        }
        System.out.println(sum);

    }
}