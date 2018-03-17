package com.kodilla.patterns.singleton;

import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        String log = "the last log";
        Logger logger = Logger.getLoggerInstance();

        //When
        String checkedLog = logger.getLastLog();

        //Then
        logger.log(log);
    }
}
