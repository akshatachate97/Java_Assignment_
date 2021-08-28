//Write a program in JAVA to print the area and perimeter of a rectangle



import java.util.Scanner;
public class Area_Perimeter 
{
    public static void main(String[] args) 
    {
        int l, b, perimeter, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Input the width of the rectangle: ");
        b = s.nextInt();
        System.out.print("Input the height of the rectangle:");
        l = s.nextInt(); 
        area = l * b;
        System.out.println("The area of the rectangle is:"+area);
        perimeter = 2 * (l + b);
        System.out.println("The Perimeter of rectangle is:"+perimeter);
      
    }
}