import java.util.Scanner;
class IfElseExp{
public static void main(String[] args){
Scanner myobj=new Scanner(System.in);
System.out.println("Enter your score:");
int score=myobj.nextInt();
if(score>=40){
System.out.println("You've passed this course");
 if(score<=80){
 System.out.println("But you need improvement!");
}
 else{
 System.out.println("you are doing good,keep going!");
}
}
else if(score<40 && score>=0){
System.out.println("You've not passed this course!");
}
else{
System.out.println("You've not registered for this course!");
}
}
}