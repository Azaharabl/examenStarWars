package com.azahara.Naves;

import com.azahara.Bando.Bando;

import java.time.LocalDateTime;

public class Corellian extends Nave implements ILucha, ITransporte{
    private String planeta = "Corellian";
    private int tropasTransportadas;
    private boolean hiperespacio;
    private  boolean rayoTractor;

    public Corellian(int torpedosProtonicos, Bando bando, LocalDateTime fecha,
                     int tropasTransportadas) {
        super(torpedosProtonicos, bando, fecha);
        this.tropasTransportadas = tropasTransportadas;
    }

    public int getTropasTransportadas() {
        return tropasTransportadas;
    }

    public void setTropasTransportadas(int tropasTransportadas) {
        this.tropasTransportadas = tropasTransportadas;
    }

    public boolean isHiperespacio() {
        return hiperespacio;
    }

    public void setHiperespacio(boolean hiperespacio) {
        this.hiperespacio = hiperespacio;
    }

    public boolean isRayoTractor() {
        return rayoTractor;
    }

    public void setRayoTractor(boolean rayoTractor) {
        this.rayoTractor = rayoTractor;
    }


    @Override
    public void transportoPasajeros() {
        System.out.println("transporto pasabjertos por que soy de transporte");
    }

    @Override
    public boolean lucha(Nave n2) {

    }
}
