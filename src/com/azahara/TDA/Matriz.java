package com.azahara.TDA;

import java.util.ArrayList;

public class Matriz <T> extends ArrayList<ArrayList<T>> implements IMatriz<T>{
    private int filas;
    private int columnas;

    public Matriz(int filas, int columnas){
        super(filas);
        this.filas = filas;
        this.columnas = columnas;
        for (int i = 0; i <filas; i++){
            ArrayList<T> fila = new ArrayList<T>();
            for (int j = 0; j < columnas; j++) {
                fila.add(null);
                this.add(fila);
            }
        }

    }


    @Override
    public T get(int fila, int columna) {
        return this.get(fila).get(columna);
    }

    @Override
    public void set(int fila, int columna, T t) {
        this.get(fila).set(columna,t);
    }

    @Override
    public int getColumnas() {
        return this.columnas;
    }

    @Override
    public int getFilas() {
        return this.filas;
    }
}
