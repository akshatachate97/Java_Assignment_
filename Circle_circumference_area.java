/* Write a language program which accepts the radius of a circle from the user and compute the area and circumference */



import java.util.Scanner;
class Circle_circumference_area
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
 