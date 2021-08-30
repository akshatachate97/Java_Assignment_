 /*Write a JAVA program to sum of all positive integers in a sentence.   
Sample string: There are 12 chairs, 15 desks, 1 blackboard and 2 fans.
Output: 30*/


 import java.util.Scanner;
public class Sum_Of_Int_Sentence
{
    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        int count =0;
        String tmp = "0";
		System.out.println("Input some text and numeric values:"); 
        char ch[]=in.nextLine().toCharArray();
        for(int i=0; i<ch.length; i++)
          {
           while(i<ch.length&&(Character.isDigit(ch[i])))
            {
                tmp+=ch[i];
                i++;
             }
           count+=Integer.valueOf(tmp);
           tmp="0";
            }   
		System.out.println("\nSum of the numeric values:"); 	
        System.out.println(count);
    }
}



