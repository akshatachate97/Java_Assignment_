//Write a program that reads a set of integers, and then prints the sum of the even and odd integers


import java.util.Scanner;

public class Sum_OF_Even_Odd
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
     
        int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;
        
        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();
        
            if( number % 2 == 0)
            {
                evenSum += number;
            }
            else
            {
                oddSum += number;
            }
        
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
            
        }while(choice=='y' || choice == 'Y');
        
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }  
}