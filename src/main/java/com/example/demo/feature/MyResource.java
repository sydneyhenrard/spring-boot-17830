package com.example.demo.feature;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class MyResource {
    private final MyService myService;

    public MyResource(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/now")
    public ResponseEntity<Instant> now() {
        return ResponseEntity.ok(myService.now());
    }
}
