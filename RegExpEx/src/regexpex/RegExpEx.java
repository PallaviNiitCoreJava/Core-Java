package regexpex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpEx {

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a String ");
        str = sc.next();
        
        Pattern p = Pattern.compile("[^a-zA-Z0-9]s");
        
        Matcher m = p.matcher(str);
        
        if (m.matches() == true) {
            System.out.println("Pattern is Matched");
        } else {
            System.out.println("Pattern is Not Matched");
        }
        
        
        System.out.println((Pattern.compile(".s.").matcher(str).matches())
                ?
                "Pattern is Matched"
                :
                "Pattern is Not Matched");
       
    
       
        if (Pattern.compile(".s.").matcher(str).matches() == true) {
            System.out.println("Pattern is Matched");
        } else {
            System.out.println("Pattern is Not Matched");
        }
     
        
//        System.out.println(Pattern.matches("[a-zA-Z]", "a")?"Pattern Matched":"Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-zA-Z]", "ab")?"Pattern Matched":"Pattern Not Matched");
//        System.out.println(Pattern.matches("[^a-zA-Z]", "a")?"Pattern Matched":"Pattern Not Matched");
//        System.out.println(Pattern.matches("[^a-zA-Z]", "@")?"Pattern Matched":"Pattern Not Matched");
//        System.out.println(Pattern.matches("[abc]", "ab")?"Pattern Matched":"Pattern Not Matched");
//        System.out.println(Pattern.matches("[abc]", "a")?"Pattern Matched":"Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-d[m-p]]", "a")?"Pattern Matched":"Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-dm-p]", "a")?"Pattern Matched":"Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-d[m-p]]", "am")?"Pattern Matched":"Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-d[m-p]]", "e")?"Pattern Matched":"Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-d[m-p]]", "eq")?"Pattern Matched":"Pattern Not Matched");
//        System.out.println(Pattern.matches("", "")?"Pattern Matched":"Pattern Not Matched");
//        System.out.println(Pattern.matches("", "")?"Pattern Matched":"Pattern Not Matched");
//        System.out.println("");
        
    }

}
