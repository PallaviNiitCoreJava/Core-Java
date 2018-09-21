package regexexample;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample {

    public static void main(String[] args) {
//        int a=56,b=78;
//        int big=0;
//        if(a>b)
//        {
//            big=a;
//        }
//        else
//        {
//            big=b;
//        }
        //condition ? true value : false value;
//        big=a>b?a:b;       
//        System.out.println("Bigger Number is "+big);
//        System.out.println("Bigger Number is "+(a>b?a:b));

//        String str;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a String ");
//        str = sc.next();
//        //1st Way
//        Pattern p=Pattern.compile(".s");
//        Matcher m=p.matcher(str);
//        boolean b=m.matches();
//        System.out.println(b);
//        
//        if(b) str="String is Valid";
//        else str="String is Invalid";
//        System.out.println(str);
//
//        String s=b?"String is Valid":"String is Invalid";
//        System.out.println(s);
//        //2nd Way
//        boolean b=Pattern.compile(".s.").matcher(sc.next()).matches();
//        System.out.println(b);
        //3rd Way
//       System.out.println("if pattern is .s then "+str+" gives " + Pattern.matches(".s", str));
//
//        if(str.equals("Pallavi"))
//        {
//            System.out.println("Pranay will not get Books");
//        }
//        else
//        {
//            System.out.println("Pranay will get Books");
//              
//        }
//        System.out.println(Pattern.matches(".s", "as") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches(".s", "iss") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches(".s", "5s") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches(".s", ".s") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches(".s", "@s") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches(".s", "s@") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[aeoui]s", "@s") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[aeoui]s", "bs") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[aeoui]s", "as") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[aeoui]s", "is") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[aeoui]s", "ias") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]s", "as") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]s", "ls") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]s", "ws") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]s", "is") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]s", "As") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]s", "2s") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]s", "2$s") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-zA-Z]s", "As") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-zA-Z]s", "as") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-zA-Z]s", "1s") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-zA-Z]s", "#s") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-zA-Z]{6}", "dghhgs") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-zA-Z]{6}", "aefyio") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-zA-Z]{6}", "aefyi") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-zA-Z]{6}", "aefyift") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[0-9]{10}", "1234565432") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[0-9]{10}", "12565432") ? "Pattern Matched" : "Pattern Not Matched");
//        // ? is 0 or 1
//        // + is 1 or more 
//        // * is 0 or more 
//        System.out.println(Pattern.matches("[a-z]?s", "") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]?s", "s") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]?s", "as") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]?s", "abs") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]*s", "s") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]*s", "dfss") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]+s", "dfss") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]+s", "s") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]{6}", "rtyuio") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]{6}", "rtyui") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]{6}", "rtyuifgfg") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]{6,}", "wervbn") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]{6,}", "wvbn") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]{6,}", "wervbnfdgsfg") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]{4,9}", "ertry") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]{4,9}", "ertryrtyu") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]{4,9}", "er") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]{4,9}", "erdfgxcbfgdfg") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]{0,9}", "") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z]{0,9}", "gdfgdfgdf") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[^abc]{0,9}", "hfg") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[^abc]{0,9}", "*%g") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z[^abc]]{0,9}", "abg") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z&&[^abc]]{0,9}", "lfg") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[a-z&&[^abc]]{0,9}", "afg") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println("\"Pal\\lavi\"");
//        System.out.println(Pattern.matches("\\d", "63463346") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("\\d", "dsfd") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("\\D", "dsfd") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("\\D", "345") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("[p][o][t]", "pot") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("\\bpot\\b", "pot") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("\\bpot\\b", "potter") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("pot\\B", "pot") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("pot\\B[a-z]*", "potter") ? "Pattern Matched" : "Pattern Not Matched");
//        System.out.println(Pattern.matches("pot\\B[a-zA-Z0-9]*", "pottop") ? "Pattern Matched" : "Pattern Not Matched");
       
    }

}
