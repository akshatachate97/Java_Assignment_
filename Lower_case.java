  //Write a JAVA program to replace all the lower-case letters of a given string with the corresponding capital letters


public class Lower_case
 {  
    public static void main(String[] args) {  
          
        String str1="doraemon oppa";  
        StringBuffer newStr=new StringBuffer(str1);  
          
        for(int i = 0; i < str1.length(); i++) {  
                       if(Character.isLowerCase(str1.charAt(i))) {  
                           newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));  
            }  
            
            else if(Character.isUpperCase(str1.charAt(i))) {  
                 
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));  
            }  
        }  
        System.out.println("String after case conversion : " + newStr);  
    }  
}  