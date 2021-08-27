   //Write a program in JAVA to check whether a number is positive, negative or zero



import java.util.Scanner;
public class Postive_Negative_zero 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Input a number :");
        n = s.nextInt();
        if(n > 0)
        {
            System.out.println("The entered number is Positive");
        }
        else if(n < 0)
        {
            System.out.println("The entered number is Negative");
        }
        else
        {
            System.out.println("The entered number is zero ");
        }
    }
}    