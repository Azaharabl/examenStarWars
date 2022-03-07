package com.azahara.TDA;

import java.util.ArrayList;

public class Pila<T> extends ArrayList<T> implements IPila<T> {
    @Override
    public void push(T t) {
        this.add(0,t);
    }

    @Override
    public T pop() {
        //puede devolver null
        return this.pop();
    }

    @Override
    public T peek() {
        return this.get(0);
    }
}
