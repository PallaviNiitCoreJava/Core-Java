package regexpexample;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleExample {

    public static void main(String[] args) {
//        //Locale locale = Locale.getDefault();
//        Locale locale = new Locale("cn", "cn");//for the specific locale  
//
//        System.out.println(locale.getDisplayCountry());
//        System.out.println(locale.getDisplayLanguage());
//        System.out.println(locale.getDisplayName());
//        //System.out.println(locale.getISO3Country());
//        //System.out.println(locale.getISO3Language());
//        System.out.println(locale.getLanguage());
//        System.out.println(locale.getCountry());
        Locale.setDefault(new Locale("us", "US")); 
        
        String str="Hello, How Are you?";
        System.out.println("Message in " + Locale.US + ":" +str);

        //changing the default locale to indonasian   
        Locale.setDefault(new Locale("fr", "FR"));
        System.out.println("Message in " + Locale.getDefault() + ":" + str);

    }
}
