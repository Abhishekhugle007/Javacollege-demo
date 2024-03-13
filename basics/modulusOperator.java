package basics;
import java.util.Scanner;
public class modulusOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.out.println("Enter the value 1st:");
        int a=sc.nextInt();
        System.out.println("Enter the value 2nd:");
        int b=sc.nextInt();
        System.out.print(a%b);
    }
}
