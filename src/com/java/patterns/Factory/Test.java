package com.java.patterns.Factory;

import com.java.patterns.Factory.Interfaces.Watch;
import com.java.patterns.Factory.Interfaces.WatchMaker;
import com.java.patterns.Factory.WachMakersImpl.DigitalWatchMaker;
import com.java.patterns.Factory.WachMakersImpl.MechanicalWatchMaker;

public class Test {
    public static void main(String[] args) {


        try {
            WatchMaker maker = WatchMaker("digital");
            Watch watch = maker.createWatch();
            watch.showTime();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static WatchMaker WatchMaker(String name) throws Exception {
        switch (name){
            case "digital" :  return new DigitalWatchMaker();
            case "mechanical" : return new MechanicalWatchMaker();
            default: throw new Exception("Maker with name " + name + " does not exist!!!");
        }
    }
}
