  //Write a program in JAVA to convert temperature in Celsius to Kelvin

   
import java.util.Scanner;
class Celsius_To_Kelvin
{
    public static void main(String args[])
    {
    	
    Double kel, cel;
    Scanner sc=new Scanner(System.in);
    System.out.println("Input the temperature in Celsius : ");
    cel=sc.nextDouble();
    kel=(cel+273.15);
    System.out.println("The temperature in Celsius:" +cel);
    System.out.println("The temperature in Kelvin:" +kel);
}
} 