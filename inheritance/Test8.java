class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    int id;

    Employee(String name, int id) {
        super(name);   // call parent constructor
        this.id = id;
    }

    void display() {
        System.out.println(name + " " + id);
    }
}

public class Test8 {
    public static void main(String[] args) {
        Employee e = new Employee("John", 101);
        e.display();
    }
}