package com.hasitha.naming.initial;


import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class TPSFalcon{

    private int t = 10;

    private AtomicInteger k = new AtomicInteger(0);
    private PeakT p = new PeakT(0, LocalDateTime.now());

    private static TPSFalcon i = null;

    private TPSFalcon() {
    }

    public static synchronized TPSFalcon getInstance() {
        if (i == null) {
            i = new TPSFalcon();
        }
        return i;
    }

    public boolean mmShouldWeAllowThis() {
        return i.k.incrementAndGet() > t;
    }

    public synchronized void reset() {
        i.doTheThing(i.k.get());
        i.k.set(0);
    }

    private synchronized void doTheThing(int tps) {
        if (tps > i.p.getPeakTps()) {
            i.p = new PeakT(tps, LocalDateTime.now());
        }
    }

    public PeakT fetchPeakTps() {
        return i.p;
    }

    public void clearrrrrr() {
        i.p = new PeakT(0, LocalDateTime.now());
    }

    public void setMaxTps(int maxTps) {
        this.t = maxTps;
    }
}
