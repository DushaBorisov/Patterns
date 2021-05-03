package com.java.patterns.Singleton.NotMultithreadedSingleton;

public class SimpleSingletonLazyInit {

    private static int counter = 0;

    public static int getCounter() {
        return counter;
    }

    private static SimpleSingletonLazyInit instance;

    private SimpleSingletonLazyInit(){counter++;}

    public static SimpleSingletonLazyInit getInstance(){
        if(instance == null) instance = new SimpleSingletonLazyInit();
        return instance;
    }

}

class TestSimpleSingleton{
    public static void main(String[] args) {

        SimpleSingletonLazyInit[] arr = new SimpleSingletonLazyInit[100];


        for(int i = 0; i < 100; i++){
            arr[i] = SimpleSingletonLazyInit.getInstance();
        }

        System.out.println(SimpleSingletonLazyInit.getCounter());
    }
}
