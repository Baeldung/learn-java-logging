package com.baeldung.ljl;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

class JavaLoggingUnitTest {

    @Test
    void whenMessagesLoggedUsingGlobalAndPackageLogger_thenMessagesLoggedAccordingToConfiguration() {
        Logger globalLogger = Logger.getGlobal();
        Logger packageLogger = Logger.getLogger(JavaLoggingUnitTest.class.getName());

        logAtAllLevels(globalLogger);
        logAtAllLevels(packageLogger);
    }

    private void logAtAllLevels(Logger logger) {
        String loggerName = logger.getName();
        logger.finest("Sample FINEST log from logger: " + loggerName);
        logger.finer("Sample FINER log from logger: " + loggerName);
        logger.fine("Sample FINE log from logger: " + loggerName);
        logger.config("Sample CONFIG log from logger: " + loggerName);
        logger.info("Sample INFO log from logger: " + loggerName);
        logger.warning("Sample WARNING log from logger: " + loggerName);
        logger.severe("Sample SEVERE log from logger: " + loggerName);
    }

}