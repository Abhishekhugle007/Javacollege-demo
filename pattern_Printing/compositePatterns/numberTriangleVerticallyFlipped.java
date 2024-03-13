package pattern_Printing.compositePatterns;
import java.util.Scanner;
public class numberTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) { //row
            for (int j = 1; j <=n-i;j++) { // column
                System.out.print(" "+"  ");
            }
            for (int j = 1; j<=i; j++) { // column
                System.out.print(j +"  ");

            }
            System.out.println();
        }
    }
}
