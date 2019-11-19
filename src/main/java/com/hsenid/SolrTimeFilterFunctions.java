package com.hsenid;

public class SolrTimeFilterFunctions {
    public static String getFilteredDate(String timeFilter1, String timeFilter2, String timeTemp) {
        StringBuffer temp = new StringBuffer();
        temp.append("datetime: [");
        temp.append(timeTemp);
        temp.append(timeFilter1);
        temp.append(" TO ");
        temp.append(timeTemp + timeFilter2 + " ]");
        return temp.toString();
    }
}
