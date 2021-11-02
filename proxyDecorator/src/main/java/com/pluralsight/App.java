package com.pluralsight;

import com.pluralsight.proxy.ExpensiveObject;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import jakarta.inject.Inject;
//import org.jboss.weld.environment.se.Weld;
//import org.jboss.weld.environment.se.WeldContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// see https://docs.jboss.org/weld/reference/3.0.0.Final/en-US/html_single/#_enabling_decorators
public class App {
    private static Logger LOGGER = LoggerFactory.getLogger(App.class);

    @Inject
    private ExpensiveObject expensiveObject;

    public void run() {
        LOGGER.info(expensiveObject.getInfo("key1"));
    }

    public static void main( String[] args )
    {
        SeContainerInitializer containerInit = SeContainerInitializer.newInstance();
        try (SeContainer container = containerInit.initialize()) {
            // Fire synchronous event that triggers the code in App class.
            // container.getBeanManager().fireEvent(new SimpleEvent());

            container.select(App.class).get().run();
        }
// Alternative:
//        Weld weld = new Weld();
//        try (WeldContainer weldContainer = weld.initialize()) {
//            weldContainer.select(App.class).get().run();
//        }

    }
}
