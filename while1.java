
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=1;
        while (n>=0) {
        n = in.nextInt();
        count+=1;
        }
        System.out.println(count);
    }
}