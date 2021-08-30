/*Write a program to calculate the sum of following series where n is input by user. 
1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n */


import java.util.Scanner;

public class Sum_Of_Series
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int number;  // To hold number of terms

        double sum = 0;

        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();
  
        for(int i = 1; i <= number; i++)
	{
            sum += 1.0/i;
	}
        
        System.out.println("sum: " + sum);
    }  
}
