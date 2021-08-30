//Write a program in JAVA to enter length in centimeter and convert it into meter and kilometer


import java.util.Scanner;
class Centi_Meter_KM
{
	public static void main(String args[])
 {
		Scanner sc = new Scanner(System.in);
		float km, meter, centi;
		System.out.print("Input the distance in centimeter:");
		centi = sc.nextFloat();
		meter = (centi / 100);
		km = (centi / 100000);
		System.out.println("The distance in meter is:" + meter);
		System.out.println("The distance in kilometer is:" + km);
	}
}