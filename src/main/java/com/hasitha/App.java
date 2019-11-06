package com.hasitha;

import java.util.logging.Logger;

public class App {

    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {


        TPSFalcon tpsFalcon = TPSFalcon.getInstance();
        ProfileUpdateFalcon profileUpdateFalcon = ProfileUpdateFalcon.getInstance();


        PeakT peakT = tpsFalcon.fetchPeakTps();
        int count = profileUpdateFalcon.getCount();



    }
}
