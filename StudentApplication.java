import java.util.Scanner;
class StudentApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Application =====");
        System.out.println("1.Check Grade");
        System.out.println("2.Check Pass/Fail");
        System.out.println("3.Exit");
        System.out.print("Enter your choice:");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter marks (0-100): ");
                int marks=sc.nextInt();

                if (marks>=90) {
                    System.out.println("Grade:A");
                } else if (marks>=75) {
                    System.out.println("Grade:B");
                } else if (marks>=60) {
                    System.out.println("Grade:C");
                } else if (marks>=40) {
                    System.out.println("Grade:D");
                } else {
                    System.out.println("Grade:F(Fail)");
                }
                break;

            case 2:
                System.out.print("Enter marks (0-100): ");
                int score = sc.nextInt();

                if (score >= 40) {
                    System.out.println("Result: Pass");
                } else {
                    System.out.println("Result: Fail");
                }
                break;

            case 3:
                System.out.println("Thank you!");
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
