class Person {
    private int age;
    private String name;

    public void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + " " + age);
    }
}

class Employee extends Person {
    private String empId;

    public void setEmp(String id) {
        empId = id;
    }

    public void display() {
        show();
        System.out.println("ID: " + empId);
    }
}

public class Test9 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setData("Anu", 21);
        e.setEmp("E101");
        e.display();
    }
}