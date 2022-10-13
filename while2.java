
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        int n;
        do {
            n = in.nextInt();
            if (n > 10)
                ans += n;

            } while (n % 5 != 0) ;

            System.out.println(ans);
    }
}