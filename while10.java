import java.util.Scanner;
public class while10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i = 0;
        int count = 0;
        while (true) {
            a+=1;
            while(i<=a/2){
                i+=1;
                if(a%i==0){
                    count+=1;}
            }
            if (count==1){
                System.out.println(a);
                break;}
            else{
                count=0;
                i=0;
            }
        }
    }
}