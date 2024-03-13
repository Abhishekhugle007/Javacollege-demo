package pattern_Printing.specialPatterns;
import java.util.Scanner;
public class starTraiangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n:");
        int n = sc.nextInt();
    for (int i = 1; i <=n ; i++) { //row
        for (int j = 1; j <=n; j++) { // columns
            if(i+j>n)
                System.out.print("*" + " ");
            else System.out.print(" "+ " ");
        }
        System.out.println();
    }
}

}
