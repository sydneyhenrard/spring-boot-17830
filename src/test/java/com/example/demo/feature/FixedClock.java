package com.example.demo.feature;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

@TestConfiguration
public class FixedClock {

    @Bean
    public Clock clock() {
        return Clock.fixed(Instant.MIN, ZoneId.of("Z"));
    }

}
