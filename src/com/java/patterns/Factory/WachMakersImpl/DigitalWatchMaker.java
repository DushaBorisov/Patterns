package com.java.patterns.Factory.WachMakersImpl;

import com.java.patterns.Factory.Interfaces.Watch;
import com.java.patterns.Factory.Interfaces.WatchMaker;
import com.java.patterns.Factory.models.DigitalWatch;

public class DigitalWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
