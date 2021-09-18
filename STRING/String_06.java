/*How to reverse a given String? 
 Write a program to reverse a String in Java or choice of your programming language.
 You can write either the recursive or iterative solution. For example, if a given
 input is "abcd," then your function should return "dcba"*/ 


import java.io.FileNotFoundException;
import java.io.IOException;

public class String_06
{

    public static void main(String args[]) throws FileNotFoundException, IOException {

        //original string
        String str = "java values";
        System.out.println("Original String : " + str);

        //reversed string using Stringbuffer
        String reverseStr = new StringBuffer(str).reverse().toString();
        System.out.println("Reverse String : " + reverseStr);
     }
}