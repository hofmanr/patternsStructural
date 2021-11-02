package com.pluralsight.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.inject.Inject;

import java.io.Serializable;

@Decorator
public class ExpensiveObjectDecorator implements ExpensiveObject, Serializable {
    private static Logger LOGGER = LoggerFactory.getLogger(ExpensiveObjectDecorator.class);

    @Inject @Delegate
    private ExpensiveObject expensiveObject;

    @Override
    public String getInfo(String key) {
        LOGGER.info("** Decorator ** Applying additional functionality");
        return expensiveObject.getInfo(key);
    }
}
