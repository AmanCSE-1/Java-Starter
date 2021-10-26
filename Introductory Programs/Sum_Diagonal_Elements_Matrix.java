import java.util.*;

public class Sum_Diagonal_Elements_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row,i,j,sum=0;
        System.out.print("Enter the order of Square Matrix: ");
        row = sc.nextInt();
      
        int a[][] = new int[row][row];

        for (i=0; i<row; i++) {
            for (j=0; j<row; j++) {
                System.out.print("Enter an integer: ");
                a[i][j] = sc.nextInt();
                
                if ( i==j ) {
                    sum += a[i][j]; 
                }
            }
            System.out.println();
        }

        System.out.println("Sum of Diagonal elements of given Square matrix is: " +sum);
    }
}
