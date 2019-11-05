package com.hasitha.naming.refactered;

import java.util.concurrent.atomic.AtomicInteger;

public class ProfileUpdateCountHandler {


    private AtomicInteger profileUpdateCount = new AtomicInteger(0);

    private static ProfileUpdateCountHandler instance = null;

    private ProfileUpdateCountHandler() {
    }

    public static synchronized ProfileUpdateCountHandler getInstance() {
        if (instance == null) {
            instance = new ProfileUpdateCountHandler();
        }
        return instance;
    }

    public int increment() {
        return instance.profileUpdateCount.incrementAndGet();
    }

    public int getCount() {
        return instance.profileUpdateCount.get();
    }

    public void resetCount() {
        instance.profileUpdateCount.set(0);
    }
}
