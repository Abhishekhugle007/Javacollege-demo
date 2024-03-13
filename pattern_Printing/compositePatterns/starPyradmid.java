package pattern_Printing.compositePatterns;
import java.util.Scanner;
public class starPyradmid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n:");
        int n = sc.nextInt();
        for (int i=1; i<=n;i++) { //row
            for (int j=1; j<=n-i;j++) { // column//spaces
                System.out.print(" " + "  ");
            }
                for (int j=1;j<=2*i-1; j++) { // columns//stars
                    System.out.print("* " + " ");
                }
                System.out.println();
            }
        }
    }
