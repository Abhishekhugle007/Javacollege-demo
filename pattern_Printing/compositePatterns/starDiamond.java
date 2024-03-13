package pattern_Printing.compositePatterns;
import java.util.Scanner;
public class starDiamond {
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
            nsp--;
            nst += 2;

            System.out.println();
        }
        nsp = 1;
        nst = nst - 4;
        for (int i = 1; i <= n - 1; i++) { //row
            for (int j = 1; j <= nsp; j++) { // column//spaces
                System.out.print(" " + "  ");
            }
            for (int j = 1; j <= nst; j++) { // columns//stars
                System.out.print("* " + " ");
            }
            nsp++;
            nst -= 2;

            System.out.println();
        }
    }
}



