package com.hasitha.naming.refactered;

import java.time.LocalDateTime;

public class PeakTps {
    private final int peakTps;
    private final LocalDateTime peakTpsTime;

    public PeakTps(int peakTps, LocalDateTime peakTpsTime) {
        this.peakTps = peakTps;
        this.peakTpsTime = peakTpsTime;
    }

    public int getPeakTps() {
        return peakTps;
    }

    public LocalDateTime getPeakTpsTime() {
        return peakTpsTime;
    }
}
