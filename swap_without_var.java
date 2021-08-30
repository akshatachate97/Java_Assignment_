 //Write a program in JAVA which swap the values of two variables not using third variable


import java.util.Scanner;
public class swap_without_var
{

  public static void main(String args[])
  {
       int num1,num2,swap;
       Scanner scan = new Scanner(System.in);
       System.out.print("Input first number :");
       num1 = scan.nextInt();
       System.out.print("Input second number :");
       num2 = scan.nextInt();

         num1 = num1 + num2;  
         num2 = num1 - num2;  
         num1 = num1 - num2;  

    System.out.println("After swapping the first number is= " +num1);
    System.out.println("After swapping the second number is= " +num2);

  }
}