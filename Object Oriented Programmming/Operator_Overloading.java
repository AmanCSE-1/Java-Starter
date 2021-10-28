class Operator_Overloading {
    int multiply(int x,int y) {
        return x*y;
    }
    
    String multiply(String s,int x) {
        String str = "";
        
        for (int i=0; i<x; i++) {
            str += s;
        }
        
        return str;
    }
    
    
    public static void main(String args[]) {
        Operator_Overloading myobj = new Operator_Overloading();
        
        System.out.println("2*3 = " +myobj.multiply(2, 3));
        System.out.println("Java*3 = " +myobj.multiply("Java ", 3));
    }
} 
