package regexpexample;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocalDate {

    public static void main(String[] args) {
        DateFormat formatter = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.UK);
        Date currentDate = new Date();
        String date = formatter.format(currentDate);
        System.out.println(date + " " + Locale.UK);
        formatter = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.FRANCE);
        date = formatter.format(currentDate);
        System.out.println(date + " " + Locale.FRANCE);
    }
}
