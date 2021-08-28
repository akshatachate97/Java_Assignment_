   //Write a JAVA program to display the current date and time



import java.util.*;
class CurrentDateAndTime
{
   public static void main(String args[])
   {
      int day, month, year;
      int second, minute, hour;
      GregorianCalendar date = new GregorianCalendar();
     
      day = date.get(Calendar.DAY_OF_MONTH);
System.out.println("day = " +day );
      month = date.get(Calendar.MONTH);
System.out.println("month = " +month );
      year = date.get(Calendar.YEAR);
System.out.println("year = " +year );
     
      second = date.get(Calendar.SECOND);
System.out.println("second = " +second );
      minute = date.get(Calendar.MINUTE);
System.out.println("minute = " +minute );
      hour = date.get(Calendar.HOUR);
System.out.println("hour = " +hour );

      System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);
      System.out.println("Current time is  "+hour+" : "+minute+" : "+second);
   }
}   