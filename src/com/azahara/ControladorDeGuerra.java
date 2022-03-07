package com.azahara;

import com.azahara.Bando.Bando;
import com.azahara.Bando.BandoImperio;
import com.azahara.Bando.BandoRepublica;
import com.azahara.Constructor.ConstructorNaves;
import com.azahara.Naves.ILucha;
import com.azahara.Naves.Nave;
import com.azahara.TDA.Cola;
import com.azahara.TDA.Matriz;
import com.azahara.TDA.Pila;
import com.azahara.Utiles.Util;

import java.io.Console;
import java.util.Scanner;

public class ControladorDeGuerra {




    public int pedirTamañoEspacio() {
        Scanner sc = new Scanner(System.in);
        boolean ok = false;
        int opcion= 0;
        do {
            try{
                System.out.println("Eligue el tamaño del espacio de guerra entre 6 y 10");
                opcion = sc.nextInt();
                if (opcion>=6 && opcion<=10){
                    ok=true;
                }else{
                    System.out.println("tu opcion no es un numero valido");
                }
            }catch (Exception e){
                sc.next();
                System.out.println("tu opcion no es un entero");
            }

        }while(!ok);

        return opcion;

    }

    public int pedirTiempoSimulacion() {
        Scanner sc = new Scanner(System.in);
        boolean ok = false;
        int opcion= 0;
        do {
            try{
                System.out.println("Eligue el tiempo que durará tu simulación entre 30 y 100");
                opcion = sc.nextInt();
                if (opcion>=30 && opcion<=100){
                    ok=true;
                }else{
                    System.out.println("tu opcion no es un numero valido");
                }
            }catch (Exception e){
                sc.next();
                System.out.println("tu opcion no es un entero");
            }

        }while(!ok);

        return opcion;
    }

    public Matriz<Nave> iniciarEspacioDeGuerra(int tamaño) {
        Matriz<Nave> espacio = new Matriz<Nave>(tamaño,tamaño);
        return espacio;
    }

    public Cola crearNavesDeGuerraImperio() {
        //creamos 200 naves
        Bando b= new BandoImperio();
        Cola<Nave> cola = new Cola<>();
        ConstructorNaves c = new ConstructorNaves();
        for (int i = 0; i < 200; i++) {
            //decidir tipo de nave
            boolean esNaveCoorelian = 0==(Util.random(0,1));
            if (esNaveCoorelian) {
                cola.encolar(c.naveCorellianRandom(b));
            }else{
                cola.encolar(c.naveStarDestroyerRandom(b));
            }
        }
        return cola;
    }

    public Pila crearNavesDeGuerraRepublica() {
        //creamos 200 naves
        Bando b= new BandoRepublica();
        Pila<Nave> pila = new Pila<>();
        ConstructorNaves c = new ConstructorNaves();
        for (int i = 0; i < 200; i++) {
            //decidir tipo de nave
            boolean esNaveCoorelian = 0==(Util.random(0,1));
            if (esNaveCoorelian) {
                pila.push(c.naveCorellianRandom(b));
            }else{
                pila.push(c.naveStarDestroyerRandom(b));
            }
        }
        return pila;
    }

    public void rellenarEspacio(Matriz<Nave> espacio, Cola<Nave> c, Pila<Nave> p) {
        //impares impero-cola, pares republica-pila
        for (int i = 0; i < espacio.getFilas(); i++) {
            for (int j = 0; j <espacio.getColumnas() ; j++) {
                //si esta vacio
                if(espacio.get(i,j)==null) {
                    //si es par
                    if (j % 2 == 0) {
                        Nave n = c.desencolar();
                        n.setFila(i);
                        n.setColumna(j);
                        espacio.set(i, j, n);
                    } else {
                        Nave n = p.pop();
                        n.setFila(i);
                        n.setColumna(j);
                        espacio.set(i, j, n);
                    }
                }
            }
        }
    }

    public Nave elegirNave(Matriz<Nave> espacio) {
        //hacer hasta encontrar nave de vando contrario
        boolean encontrada = false;
        Nave n;
        do {
            int fila = Util.random(0,espacio.size());
            int columna = Util.random(0,espacio.size());

            if(espacio.get(fila,columna)!=null){
                 n=espacio.get(fila,columna);
                 encontrada =true;
            }else{
                n = null;
            }

        }while(!encontrada);

       return n;

    }

    public void luchanNaves(Matriz espacio) {

        Nave n= elegirNave(espacio);

        Nave n2 =elegirNaveContraria(espacio, n);

        boolean navesDistintoBando =false;

        if (n instanceof ILucha){
            boolean ganoBatalla = ((ILucha) n).lucha(n2);

            if(ganoBatalla){
                //se elimina nave 2 y se mueve nave 1 a su sitio
                int filaN2 = n2.getFila();
                int columnaN2 = n2.getColumna();
                espacio.set(filaN2,columnaN2,null);


                n.setFila(filaN2);
                n.setColumna(columnaN2);
                espacio.set(filaN2,columnaN2,n);

            }else{
                int filaN = n.getFila();
                int columnaN = n.getColumna();
                espacio.set(filaN,columnaN,null);
            }

        }



    }

    private Nave elegirNaveContraria(Matriz espacio, Nave n) {
        Nave n2;
        boolean navesDistintoBando;
        do {
            n2 = elegirNave(espacio);

            if (n.getBando()==n2.getBando()){
                navesDistintoBando =false;
            }else{
                navesDistintoBando =true;
            }
        }while(n ==n2 && !navesDistintoBando);
        return n2;
    }
}
