package com.hsenid.v2;

import java.util.concurrent.atomic.AtomicInteger;

public class ProfileUpdateFalcon {

    private AtomicInteger profileUpdateCount = new AtomicInteger(0);

    private static ProfileUpdateFalcon instance = null;

    private ProfileUpdateFalcon() {
    }

    public static synchronized ProfileUpdateFalcon getInstance() {
        if (instance == null) {
            instance = new ProfileUpdateFalcon();
        }
        return instance;
    }

    public int increment() {
        return instance.profileUpdateCount.incrementAndGet();
    }

    public int getCount() {
        return instance.profileUpdateCount.get();
    }

    public void reset() {
        instance.profileUpdateCount.set(0);
    }
}
