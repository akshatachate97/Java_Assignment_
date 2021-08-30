/*Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number*/


import java.util.Scanner;

public class Prime_Number
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
     
        int number;
        
        System.out.print("Enter the positive integer ");
        number = console.nextInt();
        
        boolean flag = true;
        
        for(int i = 2; i < number; i++)
	{
	    if(number % i == 0)
            {
                flag = false;
                break;
            }
        }

	if(flag && number > 1)
        {
            System.out.println("Number is prime");
        }
	else
        {
            System.out.println("Number is not prime");
        }
        
    }  
}