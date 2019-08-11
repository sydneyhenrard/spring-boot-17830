package com.example.demo.feature;

import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.Instant;

@Service
public class MyService {
    private final Clock clock;

    public MyService(Clock clock) {
        this.clock = clock;
    }

    public Instant now() {
        return clock.instant();
    }
}
