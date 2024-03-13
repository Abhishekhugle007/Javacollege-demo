package pattern_Printing;
import java.util.Scanner;
public class AlphabetSquare
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the n:");
    int n=sc.nextInt();
    for (int i = 1; i <=n ; i++) { //row
        for (int j = 1; j <=n; j++) { // columns

            System.out.print((char)(j+96)+" ");
           // System.out.print((char)(j+64)+" ");
        }
        System.out.println();
    }
}
}


