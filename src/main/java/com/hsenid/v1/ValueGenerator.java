package com.hsenid.v1;

import net.bytebuddy.utility.RandomString;
import java.util.Date;
import java.sql.Timestamp;

public class ValueGenerator {

    private static final String START_DATE = "1900-01-01 00:00:00";
    private static final String END_DATE = "9998-01-01 00:00:00";
    private static final String DEFAULT_TIMESTAMP = " 00:00:00";

    public static String generator(int limit) {
        int min = 1;
        int value = (int) ((Math.random() * ((limit - min) + 1)) + min);
        return new RandomString(value).nextString().toUpperCase();
    }

    public static int numberGenerator(int lowerLmt, int upperLmt) {
        return lowerLmt + (int) (Math.random() * (upperLmt - lowerLmt));
    }

    @SuppressWarnings("Duplicates")
    public static Date dateGenerator() {
        long ofset = Timestamp.valueOf(START_DATE).getTime();
        long l = Timestamp.valueOf(END_DATE).getTime();
        long diff = l - ofset + 1;
        Timestamp rand = new Timestamp(ofset + (long) (Math.random() * diff));
        return new Date(rand.getTime());
    }

    public static Date getDateFromString(String date) {
        long timestamp = Timestamp.valueOf(date + DEFAULT_TIMESTAMP).getTime();
        return new Date(timestamp);
    }

    public static String emailGenerator() {
        return generator((int) ValueGenerator.numberGenerator(5, 30)).toLowerCase() + "@" +
                generator(1).toLowerCase() + "mail.com";
    }

    public static String nameGenerator() {
        return generator((int) ValueGenerator.numberGenerator(5, 8)) + " " +
                generator((int) ValueGenerator.numberGenerator(5, 9)).toUpperCase();
    }
}