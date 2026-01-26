import java.util.Scanner;
class bankapplication {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double balance=1000.0; 
        int choice=0;

        System.out.println("===== Welcome to Bank Application =====");

 
        while (choice!=4) {

            System.out.println("\n1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.print("Enter your choice:");

            choice = sc.nextInt();

            if (choice==1) {
                System.out.print("Enter deposit amount:");
                double deposit = sc.nextDouble();
                balance+=deposit;
                System.out.println("Amount deposited successfully.");

            } else if (choice==2) {
                System.out.print("Enter withdrawal amount:");
                double withdraw=sc.nextDouble();

                if (withdraw<=balance) {
                    balance-=withdraw;
                    System.out.println("Please collect your cash.");
                } else {
                    System.out.println("Insufficient balance!");
                }

            } else if (choice==3) {
                System.out.println("Current Balance: Rs." + balance);

            } else if (choice==4) {
                System.out.println("Thank you for using the Bank Application!");

            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

    }
}
