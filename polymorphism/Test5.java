class Account {
    void details() {
        System.out.println("Account details");
    }
}

class Savings extends Account {
    void details() {
        super.details();
        System.out.println("Savings account with interest");
    }
}

public class Test5 {
    public static void main(String[] args) {
        Account a = new Savings();
        a.details();
    }
}