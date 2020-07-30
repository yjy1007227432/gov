package org.competition.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;



public class TimeParse {

    public static String Parse(String datdString) throws ParseException {
        System.out.println(datdString);
        datdString = datdString.replace("GMT", "").replaceAll("\\(.*\\)", "");
        SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd yyyy hh:mm:ss z", Locale.ENGLISH);
        Date dateTrans = format.parse(datdString);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(dateTrans));
        return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(dateTrans));
    }

}
