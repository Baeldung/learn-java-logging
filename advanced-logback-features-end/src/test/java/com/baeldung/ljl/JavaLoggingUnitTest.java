package com.baeldung.ljl;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

class JavaLoggingUnitTest {

    private static final Logger logger = LoggerFactory.getLogger(JavaLoggingUnitTest.class);

    @Test
    void whenUsingMDC_thenContextIsPresent() {
        logger.info("No MDC data exists");
        try {
            MDC.put("userId", "ana");
            logger.info("User is starting a new transaction");
        } finally {
            MDC.clear();
        }
        logger.info("MDC data should be cleared now");
    }

    @Test
    void whenUsingMarker_thenLogsAreFiltered() {
        Marker criticalAlert = MarkerFactory.getMarker("CRITICAL_ALERT");
        logger.info("This is a regular log message.");
        logger.error(criticalAlert, "This is a critical failure that requires attention!");
    }
}
