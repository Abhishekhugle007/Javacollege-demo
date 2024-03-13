package conditional;
import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Length  :");
        float l =sc.nextFloat();
        System.out.print("Enter The Breadth :");
        float b =sc.nextFloat();
        float area = l * b;
        float perimeter = 2 * (l+b);
        System.out.println("Area of Rectangle : "+ area);
        System.out.println("Perimeter of Rectangle : "+ perimeter);
        if(area>perimeter)
        {
            System.out.println("Area of rectangle is greater than  Perimeter");
        }
        else
        {
            System.out.println("Perimeter of rectangle is greater than Area");
        }
    }
}

