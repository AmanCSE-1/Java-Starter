public class Constructor_Example {
    int length, breadth, height;

    // Default Constructor
    Box() {
        length = 4;
        breadth = 5;
        height = 6;
    }

    // Parameterized Constructor
    Box(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    // Copy Constructor
    Box(Box m) {
        length = m.length;
        breadth = m.breadth;
        height = m.height;
    }

    int volume() {
        return length * breadth * height;
    }

    public static void main(String args[]) {
        Box b = new Box();
        Box b1 = new Box(2, 3, 4);
        Box b2 = new Box(b1);

        System.out.println("Volume using Default Constructor is : " + b.volume());
        System.out.println("Volume using Parameterized Constructor is : " + b1.volume());
        System.out.println("Volume using Copy Constructor is : " + b2.volume());
    }
}
