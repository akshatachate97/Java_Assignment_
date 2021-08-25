  //Write a program in JAVA to find the Area and Perimeter of a Rectangle




import java.util.Scanner;
    class AreaAndPerimeter
{
   
    public static void main(String args[])
      {       
         int l,b,perimeter,area;
         Scanner s = new Scanner(System.in);
         System.out.print("Input the length of rectangle:");
         l = s.nextInt();    
         System.out.print("Input the width of rectangle:");
         b = s.nextInt();    
         area = l*b;
        System.out.println("The area of rectangle is:" +area);
        perimeter = 2 * (l+b);
        System.out.println("The perimeter of rectangle is:" +perimeter);
    }
       
}