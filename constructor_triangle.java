/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' 
without any parameter in its constructor*/


class Triangle{
  int a,b,c;
  public double getArea(){
    double s = (a+b+c)/2.0;
    return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
  }
  public double getPerimeter(){
    return (a+b+c)/2.0;
  }
}

class constructor_triangle{
  public static void main(String[] args){
    Triangle t = new Triangle();
    t.a = 2;
    t.b = 5;
    t.c = 6;
    System.out.println(t.getArea());
    System.out.println(t.getPerimeter());
  }
}