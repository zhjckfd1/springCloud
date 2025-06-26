package com.example.ping;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("spring-cloud-pong")
public interface PongClient {

    @GetMapping("/ping")
    String ping();

}
