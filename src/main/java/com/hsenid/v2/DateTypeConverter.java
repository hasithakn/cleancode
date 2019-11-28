package com.hsenid.v2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTypeConverter {

    public static String dateToISO(Date date) {
        try {
            String pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'";
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
            String isoTS = sdf.format(date);
            return isoTS;
        } catch (IllegalArgumentException e) {
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
        } catch (IllegalArgumentException e) {
            if (date != null) {
                return date.toString();
            } else {
                return "";
            }
        }
    }
}












/*
*   final String DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(DATE_PATTERN);

    public String dateToISO(Date date, TimeZone timeZone) {
        DATE_FORMAT.setTimeZone(timeZone);
        String dateString = DATE_FORMAT.format(date);
        return dateString;

    }


    */
