  //Write a program in JAVA to convert temperature in Kelvin to Fahrenheit

   
import java.util.Scanner;
class Kelvin_TO_Fahrenheit
{
    public static void main(String args[])
    {
    	
    Double kelvin, fahr;
    Scanner sc=new Scanner(System.in);
    System.out.print("Input the temperature in Kelvin : ");
    kelvin=sc.nextDouble();
    fahr = (9.0 / 5) * (kelvin - 273.15) + 32;
    System.out.println("The temperature in kelvin:" +kelvin);
    System.out.println("The temperature in Fahrenheit:" +fahr);
}
}