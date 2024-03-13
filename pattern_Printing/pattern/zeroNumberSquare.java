package pattern_Printing;
import java.util.Scanner;
public class zeroNumberSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n:");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j =1; j <=n; j++) {
                System.out.print(j/n+" ");
            }
            System.out.println();
        }
    }
}

