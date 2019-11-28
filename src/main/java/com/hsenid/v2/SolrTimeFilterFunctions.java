package com.hsenid.v2;

public class SolrTimeFilterFunctions {
    public static String getFilteredDate(String timeFilter1, String timeFilter2, String time) {
        StringBuffer temp = new StringBuffer();
        temp.append("datetime: [");
        temp.append(time);
        temp.append(timeFilter1);
        temp.append(" TO ");
        temp.append(time + timeFilter2 + " ]");
        return temp.toString();
    }
}




// datetime: [ '2019-11-28 00:00:00 -24HOURS' TO '2019-11-28 00:00:00 +24HOURS' ]




































//class TimeFilter {
//    private String startFilter;
//    private String endFilter;
//
//    public TimeFilter(String startFilter, String endFilter) {
//        this.startFilter = startFilter;
//        this.endFilter = endFilter;
//    }
//
//    public String getStartFilter() {
//        return startFilter;
//    }
//
//    public String getEndFilter() {
//        return endFilter;
//    }
//
//}