   //Write a program in JAVA to enter P, T, R and calculate Compound Interest


import java.util.Scanner;
class Compound_Interest
 {
	public static void main(String args[]) 
{
		double P, R, T, CP, CI;
		Scanner sc = new Scanner(System.in);

		System.out.print("Input the Principle:");
		P = sc.nextFloat();
		System.out.print("Input the Rate of Interest:");
		R = sc.nextFloat();
		System.out.print("Input the Time:");
		T = sc.nextFloat();
		CI = P * Math.pow((1 + R / 100), T) - P;
		CP = P * Math.pow((1 + R / 100), T);
		System.out.println("The Interest after compounded for the amount " + P + " for " + T + " years @ " + R + " % is:" + CI);
		System.out.print("The total amount after compounded for the amount " + P + " for " + T + " years @ " + R + " % is:" + CP);
	}
}