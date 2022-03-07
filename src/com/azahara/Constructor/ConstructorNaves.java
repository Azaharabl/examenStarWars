package com.azahara.Constructor;

import com.azahara.Bando.Bando;
import com.azahara.Naves.Corellian;
import com.azahara.Naves.Nave;
import com.azahara.Naves.StarDestroyer;
import com.azahara.Utiles.Util;

import java.time.LocalDateTime;

public class ConstructorNaves {

    public Nave naveCorellianRandom(Bando b){
        int torpedosProtonicos= Util.random(1,5);
        LocalDateTime fecha = LocalDateTime.now();
        int tropasTransportadas= Util.random(50,100);

        Corellian c = new Corellian(torpedosProtonicos, b,  fecha,
        tropasTransportadas);

        return c;
    }

    public Nave naveStarDestroyerRandom(Bando b){
        int torpedosProtonicos= Util.random(1,5);
        LocalDateTime fecha = LocalDateTime.now();
        boolean capacidadDeLucha =true;
        //no sabemos cuantas naves caza llevan suponemos que somo son enormes entre 1 y 100
        int cantidadNavesCaza = Util.random(1,100);
        int torpedosChorritronicos = Util.random(1,5);
        StarDestroyer s = new StarDestroyer(torpedosProtonicos,  b, fecha, capacidadDeLucha,
       cantidadNavesCaza,torpedosChorritronicos);
        return s;
    }

}
