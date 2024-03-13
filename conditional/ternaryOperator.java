package conditional;
import java.util.Scanner;
public class ternaryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();

        //condition ? if true :false
        System.out.println((n%2==0)?"even":"odd");
    }
}
