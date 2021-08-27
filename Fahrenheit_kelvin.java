   //Write a program in JAVA to convert temperature in Fahrenheit to Kelvin



import java.util.Scanner;
public class Fahrenheit_kelvin 
{
    public static void main(String[] args) 
    {
        double fahrenheit,kelvin;
        Scanner s = new Scanner(System.in);
        System.out.print("Input the temperature in Fahrenheit :");
        fahrenheit = s.nextDouble();
        System.out.println("The temperature in Fahrenheit :" +fahrenheit);
        kelvin = 273.5 + ((fahrenheit - 32.0) * (5.0/9.0));
        System.out.println("The Temperature in kelvin :"+kelvin);        
    }
}