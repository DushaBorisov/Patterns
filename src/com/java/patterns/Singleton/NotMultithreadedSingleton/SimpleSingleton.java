package com.java.patterns.Singleton.NotMultithreadedSingleton;

public class SimpleSingleton {

    private static int counter = 0;

    public static int getCounter() {
        return counter;
    }

    private static SimpleSingleton instance = new SimpleSingleton();

    private SimpleSingleton(){ counter ++;}

    public static SimpleSingleton getInstance(){
        return instance;
    }
}
class Test{
    public static void main(String[] args) {
        SimpleSingleton[] arr = new SimpleSingleton[100];

        for(int  i = 0; i < 100; i++){
            arr[i] = SimpleSingleton.getInstance();

        }
        System.out.println(SimpleSingleton.getCounter());
    }

}
