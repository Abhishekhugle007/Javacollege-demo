package pattern_Printing.specialPatterns;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class oddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n:");
        int n = sc.nextInt();

        // # first method
//        for (int i = 1; i <= n; i++) { //row
//            for (int j = 1; j <= i; j++) { // columns
//                System.out.print(2 * j - 1 + " ");
//            }
//            System.out.println();
//        }

          // # second method
//        for (int i = 1; i <= n; i++) { //row
//            for (int j = 1; j <= 2 * i - 1; j+=2) { // columns
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
         // # third method
        for (int i = 1; i <= n; i++) { //row
            int a=1;
            for (int j = 1; j <= i; j++) { // columns
                System.out.print(a + " ");
                a+=2;
            }
            System.out.println();
        }
    }
}
