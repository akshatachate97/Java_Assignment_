  //Write a program in JAVA to print the code (ASCII code / Unicode code etc.) of a given character 


import java.util.Scanner;
class ASCII_Value
 {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    char ch; 
 	System.out.print("Input a character:");
 	  ch=sc.next().charAt(0);	
 	  System.out.println("The ASCII value of "+ch+" is: " +(int)ch); 
  System.out.println("The character for the ASCII value "+(int)ch+" is:"+(char)((int)ch) ); 
   }
 }  