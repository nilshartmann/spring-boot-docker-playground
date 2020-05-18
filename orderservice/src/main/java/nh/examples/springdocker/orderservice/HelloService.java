package nh.examples.springdocker.orderservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private static final Logger log = LoggerFactory.getLogger(HelloService.class);

    private int count = 0;

    @Scheduled(cron = "5 * * * * *")
    public void hello() {
        log.info("Count: {}", ++count);
    }

}
