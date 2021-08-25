
// Write a program in JAVA to display the operation of pre and post increment and decrement.


import java.util.Scanner;
public class IncrementDecrement
{
    public static void main(String[] args) 
    {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer a:");
        a = s.nextInt();
        a = ++a;
        System.out.println("After Pre Increment a is:"+a);
        a = ++a;
        System.out.println("After Pre Increment a is:"+a);
        a = ++a;
        System.out.println("After Pre Increment a is:"+a);
        a = --a;
        System.out.println("After Pre Decrement a is:"+a);
        a = --a;
        System.out.println("After Pre Decrement a is:"+a);
        a = --a;
        System.out.println("After Pre Decrement a is:"+a);


   }
}


