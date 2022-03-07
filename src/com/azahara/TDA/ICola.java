package com.azahara.TDA;

public interface ICola <T>{
    public void encolar(T t);
    public T desencolar();
    public boolean esVacia();
    public  int longitud();
    public T verPrimero();
    public  String toString();

}
