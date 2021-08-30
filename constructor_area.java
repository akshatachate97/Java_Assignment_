/*Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its
 constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard*/


import java.util.*;
class Area{
  int length;
  int breadth;
  public Area(int l, int b){
    length = l;
    breadth = b;
  }
  public int getArea(){
    return length*breadth;
  }
}

class constructor_area
{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int l,b;

    System.out.println("Enter length");
    l = s.nextInt();
    System.out.println("Enter breadth");
    b = s.nextInt();

    Area a = new Area(l,b);
    System.out.println("Area : "+a.getArea());
  }
}
