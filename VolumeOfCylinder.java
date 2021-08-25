  //Write a program in JAVA to calculate the volume of a cylinder   



import java.util.Scanner;
 class VolumeOfCylinder
{
    
    public static void main(String args[])
      {
       
        Scanner s = new Scanner(System.in);
        System.out.print("Calculate the volume of cylinder:");


       System.out.print("Input the radius of cylinder:");
              double r=s.nextDouble();
       System.out.print("Input the height of cylinder:");     
              double h=s.nextDouble();
              double volume=((22*r*r*h)/7);
       System.out.println("The volume of cylinder is:" +volume);
   

    }
       
}