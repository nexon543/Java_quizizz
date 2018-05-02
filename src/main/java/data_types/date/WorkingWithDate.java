package data_types.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class WorkingWithDate {

    public static void convertTimeZones(){
       // DateFormat df=new SimpleDateFormat("")
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
       //Date date = instance.getTime();
        java.sql.Date date=new java.sql.Date(new java.util.Date().getTime());
        DateFormat formatter= new SimpleDateFormat("MM/dd/yyyy HH:mm:ss Z");
        formatter.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        System.out.println(formatter.format(date));

        formatter.setTimeZone(TimeZone.getTimeZone("Europe/Athens"));
        System.out.println(formatter.format(date));

        DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT, new Locale("en"));
        String formattedDate = df.format(date);
        System.out.println(formattedDate);
    }

    public static void main(String[] args) {
        convertTimeZones();
    }
}
