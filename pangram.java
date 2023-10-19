
import java.lang.*;
import java.util.*;
//C. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet
// from a-z)

class Pangram
{
    public static boolean Chk_Pangram(String str)
    {
        
        String cleanedStr = str.replaceAll("\\s", "").toLowerCase();

        
        HashSet<Character> charSet = new HashSet<>();

        // Iterate through each character in the cleaned string
 
        for (char ch : cleanedStr.toCharArray()) {
            if (Character.isLetter(ch)) {
                charSet.add(ch);
            }
        }

        // Check if the set size is equal to the alphabet size (26)
        return charSet.size() == 26;
    }
    
    public static void main(String[] args)
 {
    Scanner sobj = new Scanner(System.in);

   System.out.println("Enter the string:");
   String str = sobj.nextLine();
  
   str = str.toUpperCase();
   boolean Ans = Chk_Pangram(str);

   System.out.println(Ans);

} 
}