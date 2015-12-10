package org.gorillalabs.log4jAddons;

import org.apache.log4j.Category;
import org.apache.log4j.Priority;
import org.apache.log4j.spi.LoggingEvent;
import org.gorillalabs.log4jAddons.RiemannAppender;

/**
 * Created by cbetz on 09.12.15.
 */
public class RiemannAppenderTest {

    @org.junit.Test
    public void testAppendNormalBehaviour() throws Exception {
        RiemannAppender ra = new RiemannAppender();
        ra.activateOptions();

        ra.append(new LoggingEvent("fqnTest", Category.getInstance("org.test.Test"), Priority.INFO, "message", null));


        ra.append(new LoggingEvent("fqnTest", Category.getInstance("org.test.TestWithException"), Priority.WARN, "Something went wrong", new Throwable("dingeldangel")));

    }
}