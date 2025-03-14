package com.hsenid.v2;


import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;


public class TPSFalcon {

    private int m = 10;

    private AtomicInteger t = new AtomicInteger(0);
    private PeakTPS peakTps = new PeakTPS(0, LocalDateTime.now());

    private static TPSFalcon instance = null;

    private TPSFalcon() {
    }

    public static synchronized TPSFalcon getInstance() {
        if (instance == null) {
            instance = new TPSFalcon();
        }
        return instance;
    }

    public boolean isOk() {
        return instance.t.incrementAndGet() > m;
    }

    public void resetCurrentTps() {
        instance.doIt(instance.t.getAndSet(0));
    }

    private synchronized void doIt(int tps) {
        if (tps > instance.peakTps.getPeakTps()) {
            instance.peakTps = new PeakTPS(tps, LocalDateTime.now());
        }
    }

    public PeakTPS fetchPeakTps() {
        return instance.peakTps;
    }

    public void killItBro() {
        instance.peakTps = new PeakTPS(0, LocalDateTime.now());
    }

    public void setMaxTps(int maxTps) {
        this.m = maxTps;
    }
}
