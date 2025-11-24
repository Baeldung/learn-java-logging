package com.baeldung.ljl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

class JavaLoggingUnitTest {
    private static final Logger logger = LogManager.getLogger(JavaLoggingUnitTest.class);

    @Test
    void whenLoggingAtDebugAndInfoLevels_thenBothMessagesArePrinted() {
        logger.debug("Debug message from test");
        logger.info("Info message from test");
    }

}
