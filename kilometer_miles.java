  //Write a program in JAVA that converts kilometers per hour to miles per hour



import java.util.Scanner;
class kilometer_miles 

{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double kmph, mph;

		System.out.print("Input the distance in kilometer:");
		kmph = sc.nextFloat();
		mph = (kmph * 0.6213712);
		System.out.println("The " + kmph + " Km./hr. means " + mph + " Miles/hr.");
	}
}