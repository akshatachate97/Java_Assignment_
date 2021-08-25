   //Write a program in JAVA to convert temperature in Celsius to Fahrenheit



import java.util.Scanner;
public class CelsiusToFahrenheit
{
     public static void main(String args[])
     {
        double celsius,fahren;
         Scanner scanner;
         scanner = new Scanner(System.in);
       //take temperature in celsius as input from user
        System.out.println("Input temperature in Celsius");
        System.out.println("The temperature in Celsius");
        celsius = scanner.nextFloat();
         fahren = (9.0 / 5.0) * celsius + 32;
       System.out.println("The Temperature in Fahrenheit =" +fahren);
      }
   }
 