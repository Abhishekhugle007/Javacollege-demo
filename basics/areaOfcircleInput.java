package basics;
import java.util.Scanner;
public class areaOfcircleInput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius:");
        double r = sc.nextDouble();
        double a = 3.141592 * r * r;
        System.out.print(a);
    }
}
