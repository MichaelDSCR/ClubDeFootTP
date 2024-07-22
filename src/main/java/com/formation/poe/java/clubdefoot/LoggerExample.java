package com.formation.poe.java.clubdefoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggerExample.class);

    public void performLogging() {
        logger.debug("This is a debug message from LoggerExample");
        logger.info("This is an info message from LoggerExample");
    }

    public static void main(String[] args) {
        LoggerExample example = new LoggerExample();
        example.performLogging();
    }
}
