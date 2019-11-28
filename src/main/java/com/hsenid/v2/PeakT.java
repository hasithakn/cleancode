package com.hsenid.v2;

import java.time.LocalDateTime;

public class PeakT {
    private final int peakTps;
    private final LocalDateTime peakTpsTime;

    public PeakT(int peakTps, LocalDateTime peakTpsTime) {
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
