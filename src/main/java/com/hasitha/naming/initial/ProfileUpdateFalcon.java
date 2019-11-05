package com.hasitha.naming.initial;

import java.util.concurrent.atomic.AtomicInteger;

public class ProfileUpdateFalcon {

    private AtomicInteger ai = new AtomicInteger(0);

    private static ProfileUpdateFalcon i = null;

    private ProfileUpdateFalcon() {
    }

    public static synchronized ProfileUpdateFalcon getInstance() {
        if (i == null) {
            i = new ProfileUpdateFalcon();
        }
        return i;
    }

    public int increment() {
        return i.ai.incrementAndGet();
    }

    public int getCount() {
        return i.ai.get();
    }

    public void makeItZeroooooooo() {
        i.ai.set(0);
    }
}
