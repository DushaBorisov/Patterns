package com.java.patterns.Iterator;

import com.java.patterns.Iterator.Interfaces.Iterable;
import com.java.patterns.Iterator.Interfaces.Iterator;

public class MyCollection<T> implements Iterable<T> {

    private Object[] array;

    private int length;
    private int number_of_elem;


    public MyCollection(){
        array = new Object[7];
        length = 3;
        number_of_elem = 0;
    }


    private void checkBounds(){
        if(number_of_elem >= length){
            Object[] helpArray = new Object[number_of_elem  * 2];
            for(int i = 0; i < this.number_of_elem; i++ ){
                helpArray[i] = array[i];
            }
            array = helpArray;
            this.length = number_of_elem  * 2;

        }
    }


    public void add(T element){
        checkBounds();

        array[number_of_elem] = element;
        number_of_elem++;

    }

    public void  add(int index, T obj){
        checkBounds();
        for(int i = number_of_elem - 1 ; i >= index; i--){
            array[i+1] = array[i];
        }
        array[index] = obj;
        number_of_elem++;
    }


    @Override
    public Iterator iterator() {
        return new Myiterator();
    }

    class Myiterator implements Iterator<T>{

        int index;

        public Myiterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            if (index < array.length && array[index] != null) return true;
            else
                return false;
        }

        @Override
        public T next() {
            return (T)array[index++];
        }
    }
}
