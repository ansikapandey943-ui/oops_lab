class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Walking");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Barking");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Flying");
    }
}

public class Test11 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Bird b = new Bird();

        d.eat();
        d.walk();
        d.bark();

        b.eat();
        b.fly();
    }
}