//A. Take a sentence as an input and reverse every word in that sentence.
// a. Example - This is a sunny day > shiT si a ynnus yad.

import java.lang.*;
import java.util.*;


class String_Rev
{
    public static void reverses (String Str)
    {
        String newstr2 = Str.trim();
      
     String arr[] = newstr2.split(" ");
  
 for(int i = 0;i<arr.length;i++)
    {
      StringBuffer sb = new StringBuffer(arr[i]);
       System.out.print(sb.reverse()+" ");//reverse is inbuilt
    }
   
    }

public static void main(String[] args)
 {
    Scanner sobj = new Scanner(System.in);

   System.out.println("Enter the string:");
   String str = sobj.nextLine();
  
  System.out.println("Reversed String: ");
    reverses(str);
   

} 
}