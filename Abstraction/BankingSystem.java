interface Bank {
    void deposit(int amount);
    void withdraw(int amount);
}

class SBI implements Bank {
    int balance = 1000;

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(int amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    void display() {
        System.out.println("Balance: " + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SBI obj = new SBI();
        obj.deposit(500);
        obj.withdraw(200);
        obj.display();
    }
}