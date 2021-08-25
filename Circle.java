  //Write a program in JAVA to find the area and circumference of a circle  



import java.util.Scanner;
class Circle
{
     static Scanner sc = new Scanner(System.in);
     public static void main(String args[])
   {
      System.out.print("Input the radius(1/2 of diameter) of circle: ");

      double radius = sc.nextDouble();
      //Area = PI*radius*radius
      double area = Math.PI * (radius*radius);
      System.out.println("The area of circle is:" +area);
      //Circumference  = 2*PI*radius
     double circumference = Math.PI * 2 *radius;
     System.out.println("The circumference of circle is:" +circumference);
      }
  }
 