import java.util.*;

public class Rectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length of Rectangle: ");
        float length = sc.nextFloat();
        
        System.out.println(("Enter Breadth of Rectangle: "));
        float breadth = sc.nextFloat();
        
        float area = length * breadth;
        float perimeter = 2 * (length + breadth);
        
        System.out.println("Area of Rectangle is : " + area);
        System.out.println("Perimeter of Rectangle is : " + perimeter);
    }
}
