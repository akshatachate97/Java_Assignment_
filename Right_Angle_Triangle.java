 //Write a JAVA program to check whether given length of three side form a right triangle


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner; 
class Right_Angle_Triangle 
{
    Scanner sc = new Scanner(System.in);
    public void run() {
		System.out.println("Input three integers(sides of a triangle)");
        int[] int_num = new int[]{
               sc.nextInt(),sc.nextInt(),sc.nextInt()
            };
            Arrays.sort(int_num);
			System.out.println("If the given sides form a right triangle?"); 
            ln((int_num[2]*int_num[2]==int_num[0]*int_num[0]+int_num[1]*int_num[1])?"Yes":"No");        
    } 
    public static void main(String[] args) {
        new Right_Angle_Triangle().run();
    } 
    public static void pr(Object o) {
        System.out.print(o);
    } 
    public static void ln(Object o) {
        System.out.println(o);
    } 
    public static void ln() {
        System.out.println();
    }
}
   