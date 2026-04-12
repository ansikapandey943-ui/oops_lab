class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

class Advanced extends Calculator {
    int square(int x) {
        return x * x;
    }
}

class Scientific extends Advanced {
    double sqrt(int x) {
        return Math.sqrt(x);
    }
}

public class Test10 {
    public static void main(String[] args) {
        Scientific s = new Scientific();

        System.out.println(s.add(5, 3));
        System.out.println(s.square(4));
        System.out.println(s.sqrt(16));
    }
}