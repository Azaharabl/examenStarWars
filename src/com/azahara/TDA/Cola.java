package com.azahara.TDA;

import java.util.ArrayDeque;

public class Cola <T> extends ArrayDeque<T> implements ICola<T> {
    @Override
    public void encolar(T t) {
        this.addLast(t);
    }

    @Override
    public T desencolar() {
        return this.pollFirst();
    }

    @Override
    public boolean esVacia() {
        return this.isEmpty();
    }

    @Override
    public int longitud() {
        return this.size();
    }

    @Override
    public T verPrimero() {
        return this.peekFirst();
    }
}
