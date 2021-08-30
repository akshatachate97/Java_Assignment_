  //Write a program in JAVA to display various type or arithmetic operation using mixed data type


import java.util.*;
class Arithmetic_operation
{ 
public static void main (String[] args)
{
int s1=15,s2=22;
double z1= 3.5 , z2=7.5;
System.out.println("15+22= "+(s1+s2));
System.out.println(" 3.5+7.5= "+(z1+z2));
System.out.println("15+7.5=" +(s1+z2));
System.out.println(" 15-22= "+(s1-s2));
System.out.println(" 3.5-7.5= "+(z1-z2));
System.out.println(" 15-7.5=" +(s1-z2));
System.out.println("15*22= "+(s1*s2) );
System.out.println(" 3.5*7.5= "+(z1*z2));
System.out.println(" 15*7.5=" +(s1*z2));
System.out.println(" 15/22= "+(s1/s2));
System.out.println( "3.5/7.5= "+(z1/z2));
System.out.println(" 15/7.5=" +(s1/z2));
}
}