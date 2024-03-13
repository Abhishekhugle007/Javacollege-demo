package loops;
import java.util.Scanner;
public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        // 1 3 5 7 9
//        for(int i=1;i<=2*n-1;i+=2){
//            System.out.println(i);
//        } // rounds

       // another method without formula
           // increasing to decreasing level
//        // 5 1 -3 -7 -11 -15
//        int a=5, d=-4;
//        for(int i=5;i<=n;i++) {
//            System.out.println(a);
//            a += d;
//      }
         // increasing level by 2
        int a=5;
        for(int i=5;i<=n;i+=2) {
            System.out.println(a);
            a += 2;
        }
    }
}
