package com.hasitha.lessArguments;

public class TimeFunctions {

    public static void main(String[] args) {
        TimeFilter timeFilter = new TimeFilter("", "+1HOURS");
    }

    public static String getFilteredDate(String timeFilter1, String timeFilter2, String timeTemp) {
        StringBuffer temp = new StringBuffer();
        temp.append("datetime: [");
        temp.append(timeTemp);
        temp.append(timeFilter1);
        temp.append(" TO ");
        temp.append(timeTemp + timeFilter2 + " ]");
        return temp.toString();
    }


    public static String getFilteredDateRefactered(String time, TimeFilter timeFilter) {
        StringBuffer dateString = new StringBuffer();
        dateString.append("datetime: [");
        dateString.append(time);
        dateString.append(timeFilter.getStartFilter());
        dateString.append(" TO ");
        dateString.append(time + timeFilter.getEndFilter() + " ]");
        return dateString.toString();
    }

}

class TimeFilter {
    private String startFilter;
    private String endFilter;

    public TimeFilter(String startFilter, String endFilter) {
        this.startFilter = startFilter;
        this.endFilter = endFilter;
    }

    public String getStartFilter() {
        return startFilter;
    }

    public String getEndFilter() {
        return endFilter;
    }

}
