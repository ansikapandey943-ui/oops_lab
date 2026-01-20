import java.util.Scanner;
class userinputexp{
public static void main(String[] args){
Scanner details=new Scanner(System.in);
System.out.println("Enter your name:");
String name=details.nextLine();
System.out.println("Enter your age:");
int age=details.nextInt();
System.out.println("Name:"+name);
System.out.println("Age:"+age);
}
}


