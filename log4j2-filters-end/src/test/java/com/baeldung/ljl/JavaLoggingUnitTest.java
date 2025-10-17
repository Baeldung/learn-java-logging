package com.baeldung.ljl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

class JavaLoggingUnitTest {

    @Test
    void whenUsingLoggerWithThresholdFilter_thenLogsFilteredBasedOnConfiguredLevel() {
        Logger logger = LogManager.getLogger("com.baeldung.ljl.filters.threshold");

        logger.debug("Sample DEBUG log");
        logger.info("Sample INFO log");
        logger.warn("Sample WARN log");
        logger.error("Sample ERROR log");
        logger.fatal("Sample FATAL log");
    }

    @Test
    void whenUsingLoggerWithBurstFilter_thenLogsRateLimitedAfterBurst() throws InterruptedException {
        Logger logger = LogManager.getLogger("com.baeldung.ljl.filters.burst");

        for (int i = 1; i <= 100; i++) {
            logger.info("Burst message #" + i);
        }

        System.out.println("\n[Waiting for 2 seconds]\n");
        Thread.sleep(2000);

        for (int i = 1; i <= 100; i++) {
            logger.info("Post waiting burst message #" + i);
        }
    }

    @Test
    void whenUsingLoggerWithRegexFilter_thenLogsFilteredBasedOnPattern() {
        Logger logger = LogManager.getLogger("com.baeldung.ljl.filters.regex");

        logger.warn("Invalid login attempt - incorrect password entered");
        logger.info("Initiating password reset workflow");
        logger.error("New password cannot be same as previous");
    }

    @Test
    void whenUsingLoggerWithCombinedFilters_thenLogsFilteredThroughAllFilters() {
        Logger logger = LogManager.getLogger("com.baeldung.ljl.filters.combined");

        logger.warn("Suspicious payment detected with card: 4532015112830366");
        logger.error("Failed transaction for card: 5425233430109903");
        logger.warn("Transaction retry limit exceeded");
    }

}