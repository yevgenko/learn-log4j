package co.bdhr.learn_log4j.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class LoggerTest {
    @Test
    public void testWiredUp() {
        Assert.assertEquals(2, 1 + 1);
    }

    @Test
    public void testLogCreate() {
        Logger logger = LogManager.getLogger("HelloWorld");
        logger.info("Hello, World!");
    }
}
