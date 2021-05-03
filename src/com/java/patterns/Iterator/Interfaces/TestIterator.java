package com.java.patterns.Iterator.Interfaces;

import com.java.patterns.Iterator.MyCollection;

public class TestIterator {
    public static void main(String[] args) {
        MyCollection<Integer> collection = new MyCollection<>();

        for(int i = 0; i < 12; i++ ){
            collection.add(i);
        }

        Iterator<Integer> iter = collection.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
