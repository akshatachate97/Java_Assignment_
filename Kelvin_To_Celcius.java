  //Write a program in JAVA to convert temperature in Kelvin to Celsius

   
import java.util.Scanner;
class Kelvin_To_Celcius
{
    public static void main(String args[])
    {
    	
    Double kel, cel;
    Scanner sc=new Scanner(System.in);
    System.out.println("Input the temperature in Kelvin : ");
    kel=sc.nextDouble();
    cel=(kel-273.15);
    System.out.println("The temperature in kelvin:" +kel);
    System.out.println("The temperature in celsius:" +cel);
}
} 