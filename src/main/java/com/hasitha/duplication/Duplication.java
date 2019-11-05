package com.hasitha.duplication;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

/**
 * Duplication is Created by Hasithakn on 11/5/2019
 */


public class Duplication {

    public static void main(String[] args) {
        Date currentDate = Date.from(Instant.now());

        String dateString = DateUtils.dateToISO(currentDate);
        String dateStringWithOutUTC = DateUtils.dateToISOWithOutUTC(currentDate);
        System.out.println("Date : " + dateString);
        System.out.println("Date without UTC: " + dateStringWithOutUTC);


        dateString = new DateUtilsRefactored().dateToISO(currentDate, TimeZone.getTimeZone("UTC"));
        dateStringWithOutUTC = new DateUtilsRefactored().dateToISO(currentDate, TimeZone.getDefault());

        System.out.println("Date : " + dateString);
        System.out.println("Date without UTC: " + dateStringWithOutUTC);
    }
}


class DateUtils {

    public static String dateToISO(Date date) {
        try {
            String pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'";
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
            String isoTS = sdf.format(date);
            return isoTS;
        } catch (Exception e) {
            if (date != null) {
                return date.toString();
            } else {
                return "";
            }
        }
    }


    public static String dateToISOWithOutUTC(Date date) {
        try {
            String pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'";
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            String isoTS = sdf.format(date);
            return isoTS;
        } catch (Exception e) {
            if (date != null) {
                return date.toString();
            } else {
                return "";
            }
        }
    }
}




class DateUtilsRefactored {

    final String DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(DATE_PATTERN);

    public String dateToISO(Date date, TimeZone timeZone) {
        DATE_FORMAT.setTimeZone(timeZone);
        String dateString = DATE_FORMAT.format(date);
        return dateString;

    }
}