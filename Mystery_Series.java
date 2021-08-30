  //Write a program in JAVA to print a mystery series from 1 to 50

   
public class Mystery_Series 
{
public static void main(String[] args) 
{

  System.out.println( " The series are: ");	
   int nm1 = 1;
   while (true) 
   {
      ++nm1;
      if ((nm1 % 3) == 0) 
      continue;
      if (nm1 == 50) 
      break;
      if ((nm1 % 2) == 0) 
      {
         nm1 += 3;
      } 
      else 
      {
         nm1 -= 3;
      }
      System.out.print( nm1 );
   }
   System.out.print("");
   
   }

	}