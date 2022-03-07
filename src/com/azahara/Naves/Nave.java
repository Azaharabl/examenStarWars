package com.azahara.Naves;

import com.azahara.Bando.Bando;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public abstract class Nave {
    protected int torpedosProtonicos ;
    protected int id;
    public  static int numeroNaves =0;
    protected Bando bando;
    protected LocalDateTime fecha;

    public Nave(int torpedosProtonicos, Bando bando, LocalDateTime fecha) {
        this.torpedosProtonicos = torpedosProtonicos;
        this.bando = bando;
        this.fecha = fecha;
    }

    public int getTorpedosProtonicos() {
        return torpedosProtonicos;
    }

    public void setTorpedosProtonicos(int torpedosProtonicos) {
        this.torpedosProtonicos = torpedosProtonicos;
    }

    public Bando getBando() {
        return bando;
    }

    public void setBando(Bando bando) {
        this.bando = bando;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }


}
