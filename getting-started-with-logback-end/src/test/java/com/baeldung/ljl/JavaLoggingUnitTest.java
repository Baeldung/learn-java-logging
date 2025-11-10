package com.baeldung.ljl;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class JavaLoggingUnitTest {

    private static final Logger logger = LoggerFactory.getLogger(JavaLoggingUnitTest.class);

    @Test
    void whenLoggingAtEachLevel_thenDefaultLevelAndAboveArePrinted() {
        logger.error("Unable to establish connection with payment gateway after 3 retry attempts");
        logger.warn("Memory usage approaching defined threshold. Currently at: 81%");
        logger.info("user registration completed against email: john.doe@baeldung.com");
        logger.debug("Login attempt recorded from IP=192.168.0.12 via Chrome 129");
        logger.trace("Exiting method fetchUserProfiles(). Fetched 25 entries in 45ms");
    }
}