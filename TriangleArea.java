  //Write a program in JAVA to find the area of any triangle using Heron's Formula



import java.util.*;
import java.lang.Math.*;
public class TriangleArea

{
public static void main(String args[])
{
float a,b,c,s;
double area;
Scanner in = new Scanner(System.in);
System.out.print("Enter the value of first side of triangle:");
a=in.nextFloat();
System.out.print("Enter the value of second side of triangle:");
b=in.nextFloat(); 
System.out.print("Enter the value of third side of triangle:");
c=in.nextFloat();
s=(a+b+c)/2;
area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("The area of Teiangle is:" +area);
 }
}   