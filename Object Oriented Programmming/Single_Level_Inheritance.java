class Cuboid {
    int length, breadth, height;

    Cuboid() {
        length = 10;
        breadth = 20;
        height = 30;
    }

    int volume() {
        return length * breadth * height;
    }

    int surface_area() {
        return length * breadth;
    }
}

class Cube extends Cuboid {
    int side;

    Cube() {
        side = length;
        breadth = side;
        height = side;
    }
}

class Single_Level_Inheritance {
    public static void main(String[] args) {
        Cuboid myobj1 = new Cuboid();
        Cube myobj2 = new Cube();
      
        System.out.println("Volume of Cuboid is : " + myobj1.volume());
        System.out.println("Surface Area of Cuboid is : " + myobj1.surface_area());
      
        System.out.println("\nVolume of Cube is : " + myobj2.volume());
        System.out.println("Surface Area of Cube is : " + myobj2.surface_area());
    }
}
