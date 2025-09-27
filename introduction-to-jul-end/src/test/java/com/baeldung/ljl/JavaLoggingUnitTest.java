package com.baeldung.ljl;

import static java.util.Arrays.stream;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JavaLoggingUnitTest {

    private static final Logger logger = Logger.getLogger(JavaLoggingUnitTest.class.getName());

    @BeforeEach
    void setUp() {
        logger.setLevel(Level.INFO);
        stream(Logger.getLogger("").getHandlers())
            .forEach(handler ->handler.setLevel(Level.INFO));
    }

    @Test
    void givenLogger_whenLoggingAtDifferentLevels_thenLogsCorrectly() {
        logger.severe("Critical issue occurred while processing task.");
        logger.warning("Potential issue detected in task setup.");
        logger.info("Task processed successfully.");
        logger.config("Configuration loaded correctly.");
        logger.fine("Debug details: task initialization step.");
    }

    @Test
    void givenLogger_whenLoggingAtDifferentLevelsUsingLog_thenLogsCorrectly() {
        logger.log(Level.SEVERE, "Critical issue occurred while processing task.");
        logger.log(Level.WARNING, "Potential issue detected in task setup.");
        logger.log(Level.INFO, "Task processed successfully.");
        logger.log(Level.CONFIG, "Configuration loaded correctly.");
        logger.log(Level.FINE, "Debug details: task initialization step.");
    }

    @Test
    void givenLoggerOnFineLevel_whenLoggingAtDifferentLevels_thenLogsCorrectly() {
        logger.setLevel(Level.FINEST);
        stream(Logger.getLogger("").getHandlers())
            .forEach(handler ->handler.setLevel(Level.FINEST));

        logger.severe("Critical issue occurred while processing task.");
        logger.warning("Potential issue detected in task setup.");
        logger.info("Task processed successfully.");
        logger.config("Configuration loaded correctly.");
        logger.fine("Debug details: task initialization step.");
    }
}
