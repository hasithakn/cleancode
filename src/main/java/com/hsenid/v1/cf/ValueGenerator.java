package com.hsenid.v1.cf;

import net.bytebuddy.utility.RandomString;
import java.util.Date;
import java.sql.Timestamp;

public class ValueGenerator {

    private static final String START_DATE = "1900-01-01 00:00:00";
    private static final String END_DATE = "9998-01-01 00:00:00";
    private static final String DEFAULT_TIMESTAMP = " 00:00:00";

    public static String generateString(int limit) {
        int min = 1;
        int value = (int) ((Math.random() * ((limit - min) + 1)) + min);
        return new RandomString(value).nextString().toUpperCase();
    }

    public static int generateNumber(int lowerLimit, int upperLimit) {
        return lowerLimit + (int) (Math.random() * (upperLimit - lowerLimit));
    }

    public static Date generateDate() {
        long offset = Timestamp.valueOf(START_DATE).getTime();
        long endDate = Timestamp.valueOf(END_DATE).getTime();
        long timeDifference = endDate - offset + 1;
        Timestamp randomValue = new Timestamp(offset + (long) (Math.random() * timeDifference));
        return new Date(randomValue.getTime());
    }

    public static Date getDateFromString(String date) {
        long timestamp = Timestamp.valueOf(date + DEFAULT_TIMESTAMP).getTime();
        return new Date(timestamp);
    }

    public static String generateEmail() {
        return generateString((int) ValueGenerator.generateNumber(5, 30)).toLowerCase() + "@" +
                generateString(1).toLowerCase() + "mail.com";
    }

    public static String generateName() {
        return generateString((int) ValueGenerator.generateNumber(5, 8)) + " " +
                generateString((int) ValueGenerator.generateNumber(5, 9)).toUpperCase();
    }
}