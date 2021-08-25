
// Write a program in JAVA to swap two numbers


import java.util.Scanner;
public class swap
{

  public static void main(String args[])
  {
       int num1,num2,swap;
       Scanner scan = new Scanner(System.in);
       System.out.print("Input first number :");
       num1 = scan.nextInt();
       System.out.print("Input second number :");
       num2 = scan.nextInt();

        swap = num1;
        num1 = num2;
        num2 = swap;

    System.out.println("After swapping the first number is= " +num1);
    System.out.println("After swapping the second number is= " +num2);

  }
}