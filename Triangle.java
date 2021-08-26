   //Write a program in JAVA to find the third angle of a triangle



import java.util.Scanner;
class Triangle
{
public static void main(String args[])
{
    int a, b, c;
    Scanner op=new Scanner(System.in);
 
    System.out.print("Input the 1st angle of the triangle : ");
    a=op.nextInt();
    System.out.print("Input the 1st angle of the triangle : ");
    b=op.nextInt();;

    /* Compute third angle */
    c = 180 - (a + b);

    /* Print value of the third angle */
    System.out.println("Third angle of the triangle = "+c);
}
}