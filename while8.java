import java.util.Scanner;
public class while8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nechet = 0;
        while(n>0) {
            if (n%10%2!=0) {
                nechet = n % 10;
                nechet = n%10;
                break;
            }
            n/=10;
        }
        if (nechet == 0)
            System.out.println("NO");
        else
            System.out.println(nechet);
    }
}