package com.azahara.TDA;

public interface IMatriz<T> {
    public T get(int fila, int columna);

    public void set(int fila, int columna, T t);

    public int getColumnas();
    public  int getFilas();

    public String toString();


}
