package com.baeldung.ljl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

class JavaLoggingUnitTest {

    private static final Logger logger = LogManager.getLogger(JavaLoggingUnitTest.class);

    @Test
    void whenLoggingAtEachLevel_thenDefaultLevelAndAboveArePrinted() {
        logger.fatal("Incompatible database schema version - migration required before startup\n");
        logger.error("Failed to process user payment: invalid card number");
        logger.warn("API response time exceeded 2 seconds threshold");
        logger.info("Monthly newsletter mailed to 100 subscribers");
        logger.debug("User authentication token validated: userId=12345");
        logger.trace("Entering method calculateTotalPrice() with params: items=3, discount=0.15");
    }

}
