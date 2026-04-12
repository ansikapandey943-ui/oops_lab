class SmartCalc {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    void display(int a, double b) {
        System.out.println("int-double");
    }

    void display(double a, int b) {
        System.out.println("double-int");
    }
}

public class Test1 {
    public static void main(String[] args) {
        SmartCalc sc = new SmartCalc();

        System.out.println(sc.add(2, 3));
        System.out.println(sc.add(2, 3, 4));
        System.out.println(sc.add(2.5, 3.5));

        sc.display(5, 5.5);
        sc.display(5.5, 5);
    }
}