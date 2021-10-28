interface Hide {
    public void income();
} 

class Employee_1 implements Hide {
    public void income(){
        System.out.println("Monthly Income : Rs. 20,000");
    }
}

class Employee_2 implements Hide {
    public void income(){
        System.out.println("Monthly Income : Rs. 35,000");
    }
}

class Employee_3 implements Hide {
    public void income() {
       System.out.println("Monthly Income : Rs. 50,000");
    }
}

public class Interface {
    public static void main(String args[]) {
        Employee_3 myobject = new Employee_3();
        myobject.income();
    }
} 
