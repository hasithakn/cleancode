package com.hsenid.v1;

import java.util.concurrent.atomic.AtomicInteger;

public class VisitorCount {

    private static VisitorCount instance = null;
    private AtomicInteger visitorCount = new AtomicInteger(0);

    private VisitorCount() {
    }

    public static synchronized VisitorCount getInstance() {
        if (instance == null) {
            instance = new VisitorCount();
        }
        return instance;
    }

    public void incrementCount() {
        visitorCount.incrementAndGet();
    }
}
