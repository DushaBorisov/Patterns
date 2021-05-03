package com.java.patterns.Factory.models;

import com.java.patterns.Factory.Interfaces.Watch;

public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("Digital watch .....");
    }
}
