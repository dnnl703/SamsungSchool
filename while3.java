
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        int n;
        do{
            n = in.nextInt();
            if (n>9&&n<100)
                ans += n%10+n/10;
        } while(n>9&&n<100);

        System.out.println(ans);
    }
}