package pattern_Printing.specialPatterns;
import java.util.Scanner;
public class floydTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n:");
        int n=sc.nextInt();
        int a=1;
        for (int i = 1; i <=n ; i++) { //row
            for (int j = 1; j <=i; j++) { // columns
                System.out.print(a + " ");
               a++;
            }
            System.out.println();
        }
    }
}

