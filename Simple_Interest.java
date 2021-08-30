  //Write a program in JAVA to enter P, T, R and calculate Simple Interest


import java.util.Scanner;
class Simple_Interest 
{
	public static void main(String args[])
 {
		int P, R, T, SI;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the Principle:");
		P = sc.nextInt();
		System.out.print("Input the Rate of Interest:");
		R = sc.nextInt();
		System.out.print("Input the Time:");
		T = sc.nextInt();
		SI = (P * R * T) / 100;
		System.out.println("The Simple interest for the amount " + P + " for " + T + " years @ " + R + " % is:" + SI);
	}
}