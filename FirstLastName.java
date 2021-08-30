  //Write a language program in JAVA which accepts the user's first and last name and print them in reverse order with a space between them


  
import java.util.Scanner;
class FirstLastName
 {
	public static void main(String args[]) 
{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input First Name:");
		String fname = sc.next();
		System.out.print("Input Last Name:");
		String lname = sc.next();
		System.out.println("Name in reverse is:" + lname + " " + fname);
	}
}