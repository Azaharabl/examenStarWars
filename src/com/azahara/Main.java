package com.azahara;

import com.azahara.Naves.Corellian;
import com.azahara.Naves.Nave;
import com.azahara.TDA.Cola;
import com.azahara.TDA.Matriz;
import com.azahara.TDA.Pila;

public class Main {

    public static void main(String[] args) {

        ControladorDeGuerra cont = new ControladorDeGuerra();

        int TAMAÑO = cont.pedirTamañoEspacio();
        int TIEMPO = cont.pedirTiempoSimulacion();
        int temporizador = 0;
        boolean guerraFin = false;

        Matriz espacio = cont.iniciarEspacioDeGuerra(TAMAÑO);

        Cola c = cont.crearNavesDeGuerraImperio();

        Pila p =cont.crearNavesDeGuerraRepublica();

        cont.rellenarEspacio(espacio,c,p);

        do {


           cont.luchanNaves(espacio);

            if(0==temporizador%5){cont.rellenarEspacio(espacio, c, p);};

            guerrafin = cont.comprobarLuchaSigue();

            temporizador++;


        }while(!guerraFin || temporizador<TIEMPO );


        cont.mensajeFin();


    }
}
