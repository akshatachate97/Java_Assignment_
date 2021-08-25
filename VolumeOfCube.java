  //Write a program in JAVA to calculate the volume of a cube



   import java.util.Scanner;
    class VolumeOfCube{
    
    public static void main(String args[])
      {
        Scanner s = new Scanner(System.in);
        System.out.print("Input the side of cube:");
              double side=s.nextDouble();
              double  volume=side*side*side;
     System.out.println("The volume of cube is:" +volume);
   

    }
       
}