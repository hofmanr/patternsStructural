package com.pluralsight;

import com.pluralsight.decorator.DressingDecorator;
import com.pluralsight.decorator.MeatDecorator;
import com.pluralsight.decorator.Sandwich;
import com.pluralsight.decorator.SimpleSandwich;

public class App
{
    public static void main( String[] args )
    {
        // Example
//        File file = new File("output.txt");
//        try {
//            file.createNewFile();
//            OutputStream oStream = new FileOutputStream(file);
//            DataOutputStream doStream = new DataOutputStream(oStream);
//            doStream.writeChars("text");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Sandwich sandwich1 = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich1.ingredients() +  " with price " + sandwich1.price());

        Sandwich sandwich2 = new DressingDecorator(new SimpleSandwich());
        System.out.println(sandwich2.ingredients() +  " with price " + sandwich2.price());

    }
}
