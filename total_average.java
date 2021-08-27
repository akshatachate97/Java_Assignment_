   //Write a program in JAVA to compute the total and average of four numbers



import java.util.Scanner;
 
public class total_average {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input first number: ");
  int num1 = in.nextInt();
   
  System.out.print("Input second number: ");
  int num2 = in.nextInt();
   
  System.out.print("Input third number: ");
  int num3 = in.nextInt();
   
  System.out.print("Input fourth number: ");
  int num4 = in.nextInt();
      
  System.out.println("Average of five numbers is: " + 
   (num1 + num2 + num3 + num4 ) / 4);
 }
}
   