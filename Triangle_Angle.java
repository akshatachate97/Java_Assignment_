//Write a program in JAVA to enter two angles of a triangle and find the third angle   


import java.util.Scanner;

public class Triangle_Angle {

    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);

        System.out.println("Enter the two angles of triangle::\n");

        int p = in.nextInt();
        int q = in.nextInt();
        int r;

        // p, q, and r is all angles of the triangle

        // Compute third angle
        r = 180 - (p + q);

        // Output
        System.out.println("\nThird angle of the triangle = " + r + "\n");
    }
}