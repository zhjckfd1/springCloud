package pong;

import org.springframework.web.bind.annotation.GetMapping;

public interface PongController {

    @GetMapping("/ping")
    String ping();

}
