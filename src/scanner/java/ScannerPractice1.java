package scanner.java;
import java.util.Scanner;
public class ScannerPractice1{
public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your address");
		
		String address = scan.nextLine();
		
		System.out.println("Enter your age");
		 int age = scan.nextInt();
		 if (age<18) {
			 System.out.println("You are minor");
			 System.out.println("You are not eligible to work");
		 } else { if(age>18) {
			 System.out.println("You are eligile to work");file:///C:/Users/mailn/AppData/Local/slack/app-4.2.0/resources/app.asar/dist/notifications.html#
			 System.out.println("Please apply for the position");
		 }
		 
		 System.out.println("Who is youtr favorite nephiew?");
		 String nephiew= scan.next ();
		 
System.out.println("Enter your weight");
double weight= scan.nextDouble();
if(weight<120) {file:///C:/Users/mailn/AppData/Local/slack/app-4.2.0/resources/app.asar/dist/notifications.html#
	System.out.println("You are underweight");
	 System.out.println("Eat nutritious food");
}else {
	 System.out.println("Your weight is healthy");
}
System. out.println("Enter your gender");
char gender= scan.next().charAt(0);

System.out.println("Enter your name");
String name= scan.next();
	
}

 

	}
}




