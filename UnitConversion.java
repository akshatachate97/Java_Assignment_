 //Write a program in JAVA that converts kilometers per hour to miles per hour



import java.util.Scanner;

public class UnitConversion {

	public static void main(String[] args) {

		double kilometers,miles;
                Scanner input = new Scanner(System.in);
		System.out.print("Input the distance in kilometer :");
		kilometers = input.nextDouble();

		 miles = kilometers / 1.6;
           
              System.out.println(kilometers + " km/hr means " + miles + " Miles/hr") ;
             
	}
}