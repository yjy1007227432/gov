package org.competition.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BeforeWeek {
//    public static void main(String[] args) {
//        String date = "2020-07-22";
//        try {
//            Date result = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println();
//
//    }
    public static List<Date> getBeforeWeek(){


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        List<Date> dates = new ArrayList<>();

        Calendar c = null;
        for (int i=0;i<7;i++){
            c=Calendar.getInstance();
            c.add(Calendar.DAY_OF_MONTH, - i);
            dates.add(c.getTime());
        }

        return dates;

    }
}
