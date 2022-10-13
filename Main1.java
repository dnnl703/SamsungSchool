import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>=10 && n<=99)
            System.out.print("NUM");
        else if (n>=0 && n<10)
            System.out.print("DIGIT");
        else
            System.out.print("OTHER");
    }

}
