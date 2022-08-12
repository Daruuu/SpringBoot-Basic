package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import java.util.logging.Logger;
import ch.qos.logback.classic.Logger;
@SpringBootApplication
public class DemoApplication {
    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        LOGGER.info("An INFO Message");
        LOGGER.warn("A WARN Message");
        LOGGER.error("An ERROR Message");
        LOGGER.debug("A DEBUG Message");
    }
/*
    public void loggerModification(){
        LOGGER.info("An INFO Message");
        LOGGER.warning("A WARN Message");
    }

 */
}
