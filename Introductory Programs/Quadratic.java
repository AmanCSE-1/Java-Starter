import java.util.*;

class Quadratic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the co-efficients of Quadratic Equations: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double d = Math.sqrt(b * b - 4 * a * c);
        if (d > 0) {
            double r1 = (-b + d) / (2 * a);
            double r2 = (-b - d) / (2 * a);
            System.out.println("Root is " + r1);
            System.out.println("Root is " + r2);
        } else if (d == 0) {
            final double r1 = (-b) / (2 * a);
            System.out.println("Root is " + r1);
        }

        else {
            System.out.println("Imaginery Roots");
        }
    }
}
