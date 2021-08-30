  //Write a JAVA program to swap first and last digits of any number



import java.util.Scanner;
class SwapFirst_LastDigit
{
public static void main(String args[])
{
int n,f,l,r=0,tmp,swap,c,d;
Scanner s=new Scanner(System.in);
System.out.println("Input any number:");
n=s.nextInt();
tmp=n;
l=n%10;
while(n>10)
{
n=n/10;
}
f=n;
n=tmp/10;
while(n>10)
{
c=n%10;
r=r*10+c;
n=n/10;
}
swap=l;
while(r>0)
{
d=r%10;
swap=swap*10+d;
r=r/10;
}
swap=swap*10+f;
System.out.println("The number after swapping the first and last digits are:"+swap);
}
}


