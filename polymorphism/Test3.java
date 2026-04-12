class Shape {
    void area() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Circle area = πr²");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Rectangle area = l*b");
    }
}

public class Test3 {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}