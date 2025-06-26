package pong;

import com.netflix.discovery.EurekaClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class Pong implements PongController {

    @Value("${spring.application.name}")
    private String appName;

    @Lazy
    private final EurekaClient eurekaClient;

    @Override
    public String ping() {
        return "PONG FROM: " + eurekaClient.getApplication(this.appName).getName();
    }

}
