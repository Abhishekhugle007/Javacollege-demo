package loops;
import java.util.Scanner;
public class tableOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the table number:");
        int n=sc.nextInt();
        //bekkar code:i=19,20,21,.....190->171 times
        // 171 rounds
//        for (int i = 2; i<=20; i++) {
//            if (i % 2 == 0) System.out.println(i);

//            // 10 round

            for (int i =n; i <=10*n; i+=n) {
                System.out.println(i);
        }
    }
}
