package com.pluralsight.proxy1;

import java.util.HashMap;
import java.util.Map;

public class ExpensiveObjectProxy implements ExpensiveObject {
    private ExpensiveObject expensiveObject;
    private Map<String, String> cache = new HashMap<>();

    public ExpensiveObjectProxy() {
        expensiveObject = new ExpensiveObjectImpl();
    }

    public ExpensiveObjectProxy(ExpensiveObject object) {
        this.expensiveObject = object;
    }

    @Override
    public String getInfo(String key) {
        if (cache.get(key) == null) {
            cache.put(key, expensiveObject.getInfo(key));
        }
        return cache.get(key);
    }
}
