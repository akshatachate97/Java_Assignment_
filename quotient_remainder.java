 //Write a program in JAVA to compute quotient and remainder




import java.util.Scanner;
 
public class quotient_remainder {
 
    public static void main(String[] args) {
            
        int dividend,divisor;
        Scanner s = new Scanner(System.in);
        System.out.print("Input the dividend :");
        dividend = s.nextInt();
        System.out.print("Input the divisor :");
        divisor = s.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
  System.out.println("The quotient of the division is : " +quotient);
  System.out.println("The remainder of the division is : " +remainder);
 
 

    }   
}
 