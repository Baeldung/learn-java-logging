package com.baeldung.ljl;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class JavaLoggingUnitTest {

    private static final Logger logger = LoggerFactory.getLogger(JavaLoggingUnitTest.class);

    @Test
    void whenLoggingMessage_thenDisplayUsingFacade() {
        logger.info("Application started");
    }
}