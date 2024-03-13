package pattern_Printing.compositePatterns;
import java.util.Scanner;
public class starPyramidnstnsp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n:");
        int n = sc.nextInt();
        int nsp = n - 1;
        int nst = 1;
        for (int i = 1; i <= n; i++) { //row
            for (int j = 1; j <= nsp; j++) { // column//spaces
                System.out.print(" " + "  ");
            }
            for (int j = 1; j <= nst; j++) { // columns//stars
                System.out.print("* " + " ");
            }
            System.out.println();
            nsp--;
            nst += 2;

        }
    }

}