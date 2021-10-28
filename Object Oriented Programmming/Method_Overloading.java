import java.util.Scanner;

class Method_Overloading {
    Scanner sc = new Scanner(System.in);
  
    void multiply() {
        System.out.println("2 * 3" + " = " + 2*3);
    }
  
    int multiply(int x,int y) {
        return x*y;
    }
  
    double multiply(int x,double y) {
        return x*y;
    }
  
    double multiply(double x,double y) {
        return x*y;
    }
  
    public static void main(String[] args) {
        Method_Overloading obj = new Method_Overloading();
        obj.multiply();
      
        System.out.println("4 * 5 = " + obj.multiply(4, 5));
        System.out.println("4 * 5.5 = " + obj.multiply(4, 5.5));
        System.out.println("4.5 * 5.5 = " + obj.multiply(4.5, 5.5));  
    }
} 
