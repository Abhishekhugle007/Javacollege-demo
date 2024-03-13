package conditional;
import java.util.Scanner;
public class validTraiangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st slide:");
        int a=sc.nextInt();
        System.out.print("enter 2nd slide:");
        int b=sc.nextInt();
        System.out.print("enter 3rd slide:");
        int c=sc.nextInt();

        if (a+b>c && b+c>a && c+a>b) {

            System.out.println("valid triangle:");
        }
        else
        {
            System.out.println("invalid triangle:");
        }

    }
}
