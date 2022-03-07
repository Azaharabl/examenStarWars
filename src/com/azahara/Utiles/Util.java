package com.azahara.Utiles;

public class Util {
    public static int random(int numeroMinimo, int numeroMaximo){
        return (int)((Math.random()*(numeroMaximo-numeroMinimo))+numeroMinimo);
    }
}
