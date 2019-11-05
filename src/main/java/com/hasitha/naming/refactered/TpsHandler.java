package com.hasitha.naming.refactered;


import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;


public class TpsHandler {

    private int maxTps = 10;

    private AtomicInteger tps = new AtomicInteger(0);
    private PeakTps peakTps = new PeakTps(0, LocalDateTime.now());

    private static TpsHandler instance = null;

    private TpsHandler() {
    }

    public static synchronized TpsHandler getInstance() {
        if (instance == null) {
            instance = new TpsHandler();
        }
        return instance;
    }

    public boolean isTpsExceed() {
        return instance.tps.incrementAndGet() > maxTps;
    }

    public synchronized void resetCurrentTps() {
        instance.processPeakTps(instance.tps.get());
        instance.tps.set(0);
    }

    private synchronized void processPeakTps(int tps) {
        if (tps > instance.peakTps.getPeakTps()) {
            instance.peakTps = new PeakTps(tps, LocalDateTime.now());
        }
    }

    public PeakTps getPeakTps() {
        return instance.peakTps;
    }

    public void resetPeakTps() {
        instance.peakTps = new PeakTps(0, LocalDateTime.now());
    }

    public void setMaxTps(int maxTps) {
        this.maxTps = maxTps;
    }
}
