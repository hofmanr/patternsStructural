package com.pluralsight;

import com.pluralsight.proxy1.ExpensiveObject;
import com.pluralsight.proxy1.ExpensiveObjectImpl;
import com.pluralsight.proxy1.ExpensiveObjectProxy;

public class App
{
    public static void main( String[] args )
    {
        ExpensiveObject expensiveObject = new ExpensiveObjectProxy(new ExpensiveObjectImpl());
        System.out.println(expensiveObject.getInfo("EXPENSIVE"));
        System.out.println(expensiveObject.getInfo("EXPENSIVE"));
        System.out.println(expensiveObject.getInfo("NOT SO EXPENSIVE"));

        // or with a fixed implementation
        ExpensiveObject expensiveObject2 = new ExpensiveObjectProxy();
        System.out.println(expensiveObject2.getInfo("EXPENSIVE2"));
        System.out.println(expensiveObject2.getInfo("EXPENSIVE2"));
    }
}
