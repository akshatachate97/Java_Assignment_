   //Write a program in JAVA to convert temperature in Fahrenheit to Celsius



import java.util.Scanner;
public class Fahrenheit_Celsius 
{
    public static void main(String[] args) 
    {
        double celsius, fahrenheit;
        Scanner s = new Scanner(System.in);
        System.out.print("Input the temperature in Fahrenheit :");
        fahrenheit = s.nextDouble();
        System.out.println("The temperature in Fahrenheit :" +fahrenheit);
        celsius = (fahrenheit-32)*(0.5556);
        System.out.println("The Temperature in Celsius :"+celsius);        
    }
}