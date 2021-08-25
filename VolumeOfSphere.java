  //Write a program in JAVA to calculate the volume of a sphere.   


    import java.util.Scanner;
    class VolumeOfSphere{
    
    public static void main(String args[])
      {
        Scanner s = new Scanner(System.in);
        System.out.print("Input the radius of sphere:");
              double r=s.nextDouble();
              double  volume= (4*22*r*r*r)/(3*7);
     System.out.println("The volume of sphere is:" +volume);
   

    }
       
}