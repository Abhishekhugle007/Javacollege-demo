package conditional;
import java.util.Scanner;
public class threeDigitNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        if(99<n && n<1000)
        {
            System.out.println("3 digit number:");
        }
        else{
            System.out.println("not a 3 digit number:");
        }


    }
}
