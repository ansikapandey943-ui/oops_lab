import java.util.Scanner;

class salaryforloop {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of employees:");
int n=sc.nextInt();
for (int i=1;i<=n;i++) {

System.out.println("\nEmployee"+i);
            System.out.print("Enter Salary:");
            double initial = sc.nextDouble();

            double HRA=initial*0.20;
            double DA =initial* 0.10;
            double grossSalary = initial+HRA+DA;

            System.out.println("HRA (20%) : "+HRA);
            System.out.println("DA (10%)  : "+DA);
            System.out.println("Gross Salary: "+grossSalary);
        }

    }
}