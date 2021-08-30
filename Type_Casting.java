  //Write a program in JAVA to test the Type Casting

   
public class Type_Casting
{
	public static void main(String[] args) {
	System.out.println( "Print floating-point number in fixed format with 1 decimal place: ");
   
   System.out.println( "\nTest explicit type casting :\n");
   int i1 = 56, i2 = 66;
   System.out.println(  i1 / i2 );    
   System.out.println( (double)i1 / i2 ); 
   System.out.println(  i1 / (double)i2 );  
   System.out.println(  (double)(i1 / i2) );
   double d1 = 4.7, d2 = 3.9;
   System.out.println( "\nTest implicit type casting :\n") ;  
   System.out.println(  (int)d1 / i2 );    
   System.out.println(  (int)(d1 / i2) );   
   System.out.println( "\nint implicitly casts to double: \n");
    d1 = i1;    
    System.out.println(  d1);
    System.out.println( "double truncates to int!: \n");
   d2 = i2;            
   System.out.println( i2 );  
}

	}