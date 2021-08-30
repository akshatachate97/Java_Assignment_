 // Write a program in JAVA to check overflow/underflow during various arithmetical operation

   
class overflow_underflow
{ 
public static void main (String[] args)
{
int n1 = 2147483647;
System.out.println( " Overflow the integer range and set in minimum range : "+(n1+1) );
System.out.println(" Increasing from its minimum range : " +( n1 + 2)); 
System.out.println(" Product is :" + (n1 * n1 ));
 int n2 = -2147483648; 
System.out.println(" Underflow the range and set in maximum range : " +( n2 - 1)); 
 System.out.println("Decreasing from its maximum range : " +( n2 - 2));
System.out.println(" Product is : " +( n2 * n2)); 
}
}