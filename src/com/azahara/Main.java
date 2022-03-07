package com.azahara;

import com.azahara.Naves.Corellian;
import com.azahara.Naves.Nave;

public class Main {

    public static void main(String[] args) {

        ControladorDeGuerra cont = new ControladorDeGuerra();

        int TAMAÑO = cont.pedirTamañoEspacio();
        int TIEMPO = cont.pedirTiempoSimulacion();
        int temporizador = 0;
        boolean guerraFin = false;

        cont.iniciarEspacioDeGuerra(TAMAÑO);

        cont.crearNavesDeGuerra();

        cont.rellenarEspacio();

        do {

            Nave n= cont.elegirNave();

            cont.lucha(n);

            if(temporizador%5){cont.rellenarEspacio();};

            guerrafin = cont.comprobarLuchaSigue();

            temporizador++;


        }while(!guerraFin || temporizador<TIEMPO );


        cont.mensajeFin();


    }
}
