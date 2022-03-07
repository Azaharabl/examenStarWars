package com.azahara.Naves;

import com.azahara.Bando.Bando;

import java.time.LocalDateTime;

public class StarDestroyer extends Nave implements ILucha{
    boolean capacidadDeLucha;
    int cantidadNavesCaza;
    int torpedosChorritronicos;

    public StarDestroyer(int torpedosProtonicos, Bando bando, LocalDateTime fecha, boolean capacidadDeLucha,
                         int cantidadNavesCaza, int torpedosChorritronicos) {
        super(torpedosProtonicos, bando, fecha);
        this.capacidadDeLucha = capacidadDeLucha;
        this.cantidadNavesCaza = cantidadNavesCaza;
        this.torpedosChorritronicos = torpedosChorritronicos;
    }

    public int getCantidadNavesCaza() {
        return cantidadNavesCaza;
    }

    public void setCantidadNavesCaza(int cantidadNavesCaza) {
        this.cantidadNavesCaza = cantidadNavesCaza;
    }

    public int getTorpedosChorritronicos() {
        return torpedosChorritronicos;
    }

    public void setTorpedosChorritronicos(int torpedosChorritronicos) {
        this.torpedosChorritronicos = torpedosChorritronicos;
    }

    @Override
    public boolean luchar() {
        return false;
    }
}
