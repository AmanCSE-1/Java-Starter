import java.util.*;

public class Max_element_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n, i, max = 0;
        System.out.print("Enter the number of elements of Array: ");
        n = sc.nextInt();
        
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("Enter an integer number : ");
            a[i] = sc.nextInt();
            
            if (a[i] > max) {
                max = a[i];
            }
        }
        
        System.out.println("\nLargest number in the given Array is " + max);
    }
}
