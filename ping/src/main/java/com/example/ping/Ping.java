package com.example.ping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RefreshScope
@RestController
public class Ping {

    private final PongClient client;

    @Value("${key1:NO_VALUE}")
    private String key1;

    @Value("${key2:NO_VALUE}")
    private String key2;

    @Value("${key3:NO_VALUE}")
    private String key3;

    @Value("${key4:NO_VALUE}")
    private String key4;

    @Value("${key5:NO_VALUE}")
    private String key5;

    @GetMapping("/ping")
    public String ping(@RequestHeader("trace-id") String traceId) {
        log.info("trace-id: {}", traceId);
        return String.format("%s --- %s", client.ping(), List.of(key1, key2, key3, key4, key5));
    }
}
