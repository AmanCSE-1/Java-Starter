class Operating_System {
    Operating_System() {
        System.out.println("Class Operating System is created\n");
    }

    void display() {
        System.out.println("Windows is the most used Operating System\n");
    }
}


class Android extends Operating_System {
    Android() {
        System.out.println("Class Android is created\n");
    }

    void display1() {
    System.out.println("Android is the most used Operating System in Mobile phones\n");
    }
}


class Gmail extends Android {
    Gmail() {
        System.out.println("Class Gmail is created\n");
    }

    void display2() {
        System.out.println("Gmail is used for communication through Mail\n");
    }
}


class Multiple_Level_Inheritance {
    public static void main(String args[]) {
        Gmail myobj = new Gmail();
      
        myobj.display();
        myobj.display1();
        myobj.display2();
    }
}
