package com.azahara.TDA;

public interface IPila<T> {
    public void push(T t);
    public T pop();
    public T peek();
    public String toString();
}
