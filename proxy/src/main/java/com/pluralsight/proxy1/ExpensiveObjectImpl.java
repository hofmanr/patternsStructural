package com.pluralsight.proxy1;

// E.g. a webservice client
public class ExpensiveObjectImpl implements ExpensiveObject {

    public ExpensiveObjectImpl() {
        loadingConfiguration();
    }

    @Override
    public String getInfo(String key) {
        System.out.println("Get info for key " + key);
        return "Info for key " + key;
    }

    private void loadingConfiguration() {
        System.out.println("Loading configuration");
    }
}
