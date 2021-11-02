package com.pluralsight.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// E.g. a webservice client
public class ExpensiveObjectImpl implements ExpensiveObject {
    private static Logger LOGGER = LoggerFactory.getLogger(ExpensiveObjectImpl.class);

    public ExpensiveObjectImpl() {
        loadingConfiguration();
    }

    @Override
    public String getInfo(String key) {
        LOGGER.info("Get info for key " + key);
        return "Info for key " + key;
    }

    private void loadingConfiguration() {
        LOGGER.info("Loading configuration");
    }
}
