package com.baeldung.ljl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.junit.jupiter.api.Test;

import java.util.UUID;

class JavaLoggingUnitTest {
    private static final Logger logger = LogManager.getLogger(JavaLoggingUnitTest.class);

    @Test
    void whenMessagesLoggedUsingRootLogger_thenMessagedPrintedToConsole() {
        logAtAllLevels(logger);
    }

    @Test
    void whenMessagesLoggedUsingLoggerWithFileAppender_thenMessagesWrittenToFile() {
        Logger loggerWithFileAppender = LogManager.getLogger("LoggerWithFileAppender");
        logAtAllLevels(loggerWithFileAppender);
    }

    @Test
    void whenMessagesLoggedUsingLoggerWithRollingFileAppender_thenMessagesWrittenToFiles() {
        Logger loggerWithRollingFileAppender = LogManager.getLogger("LoggerWithRollingFileAppender");
        for(int i = 0; i < 1000; i++) {
            logAtAllLevels(loggerWithRollingFileAppender);
        }
    }

    @Test
    void whenMessagesLoggedUsingLoggerWithJsonFileAppender_thenMessagesWrittenToJsonFile() {
        Logger loggerWithJsonFileAppender = LogManager.getLogger("LoggerWithJsonFileAppender");
        logAtAllLevels(loggerWithJsonFileAppender);
    }

    @Test
    void whenMessagesLoggedUsingLoggerWithMDC_thenMessagesContainContextData() {
        Logger loggerWithMDC = LogManager.getLogger("LoggerWithMDC");
        loggerWithMDC.info("Initiating withdrawal request");

        ThreadContext.put("userName", "John Doe");
        ThreadContext.put("userId", UUID.randomUUID().toString());
        loggerWithMDC.info("Initiating withdrawal request");
    }

    private void logAtAllLevels(Logger logger) {
        logger.trace("Sample TRACE log");
        logger.debug("Sample DEBUG log");
        logger.info("Sample INFO log");
        logger.warn("Sample WARN log");
        logger.error("Sample ERROR log");
        logger.fatal("Sample FATAL log");
    }

}
