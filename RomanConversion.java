//B. Enter a Roman Number as input and convert it to an integer. (ex IX = 9)

//RomanConversion

import java.lang.*;
import java.util.*;

class RomanConversion
{
public static int romanToDecimal(String roman) {
       
    
HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans=map.get(roman.charAt(roman.length()-1));
        for(int i=roman.length()-1;i>0;i--)
        {
            if(map.get(roman.charAt(i))>map.get(roman.charAt(i-1)))
                ans-=map.get(roman.charAt(i-1));
            else
                ans+=map.get(roman.charAt(i-1));

           
        }
        return ans;

}
public static void main(String[] args)
 {
    Scanner sobj = new Scanner(System.in);

   System.out.println("Enter the string:");
   String str = sobj.nextLine();
  
   str = str.toUpperCase();
   int Ans = romanToDecimal(str);

   System.out.println(Ans);

} 
}