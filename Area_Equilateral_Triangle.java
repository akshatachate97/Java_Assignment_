  //Write a program in JAVA to calculate area of an equilateral triangle.   



import java.util.Scanner;
class Area_Equilateral_Triangle
 {
	public static void main(String args[]) {
		double a, area;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the value of the side of the equilateral triangle:");
		a = sc.nextFloat();
                area = Math.sqrt(3) / 4 * (a * a);
		System.out.println("The area of equilateral triangle is: " + area);
	}
}