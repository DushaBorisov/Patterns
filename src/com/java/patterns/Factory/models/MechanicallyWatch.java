package com.java.patterns.Factory.models;

import com.java.patterns.Factory.Interfaces.Watch;

public class MechanicallyWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("Mechanically watch.....");
    }
}
