package regexpexample;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpExample {
    public static void main(String[] args) {
//        Pattern p=Pattern.compile("..");
//        Matcher m=p.matcher("is");
//        boolean b=m.matches();
//        System.out.println(b);
//        System.out.println(Pattern.compile("...").matcher("ice").matches());
//        System.out.println("Enter One Character : ");
//        System.out.println(Pattern.matches(".", new Scanner(System.in).next()));
        System.out.println("use . for one char");
        System.out.println("True Values");
        System.out.println(Pattern.matches(".", "p"));
        System.out.println(Pattern.matches(".s", "*s"));
        System.out.println(Pattern.matches("p.", "pv"));
        System.out.println(Pattern.matches("ab.", "aby"));
        System.out.println("False Values");
        System.out.println(Pattern.matches(".", "pp"));
        System.out.println(Pattern.matches(".s", "*p"));
        System.out.println(Pattern.matches("p.", "ov"));
        System.out.println(Pattern.matches("ab.", "avp"));    
        
        System.out.println("Use [] for set of char");
        System.out.println("True Values");
        System.out.println(Pattern.matches("[abc]", "a"));
        System.out.println(Pattern.matches("[abc]", "b"));
        System.out.println(Pattern.matches("[abc]", "c"));
        System.out.println(Pattern.matches("[abc][abc]", "aa"));
        System.out.println(Pattern.matches("[abc].", "ax"));
        System.out.println(Pattern.matches("[a-zA-Z].", "G%"));
        
        System.out.println("False Values");
        System.out.println(Pattern.matches("[abc]", "aa"));
        System.out.println(Pattern.matches("[abc]", "o"));
        System.out.println(Pattern.matches("[abc]", "*"));
        System.out.println(Pattern.matches("[abc].", "xa"));
    }
    
}
