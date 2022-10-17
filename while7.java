
import java.util.Scanner;

public class while7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;

        while(n>0)
        {
            n/=10;
            ans+=1;

        }
        System.out.println(ans);

    }
}