/*Compute the natural logarithm of 2, by adding up to n terms in the series
1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
where n is a positive integer and input by user */


import java.util.Scanner;

 public class Natural_logarithm
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int number;  // To hold number of terms

        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();

        double sum = 0;
        int sign = 1; 
        
        for(int i = 1; i <= number; i++)
	{
            sum += (1.0 * sign) / i;
            sign *= -1;
	}
        
        System.out.println("log2: " + sum);
    }  
}