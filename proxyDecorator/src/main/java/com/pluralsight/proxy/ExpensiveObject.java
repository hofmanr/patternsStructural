package com.pluralsight.proxy;

public interface ExpensiveObject {

    // Definine the operations (could be e.g. a webservice of REST-service)
    String getInfo(String key);
}
