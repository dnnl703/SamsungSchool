
import java.util.Scanner;

public class while5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while(n>0)
        {
            n = n/2;
            count += 1;
        }
        System.out.println(count);

    }
}