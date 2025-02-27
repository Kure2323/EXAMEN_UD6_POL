package org.example;

public abstract class MutxaAwards {

    int edicion;


    public MutxaAwards(int anyo) {
        this.edicion = anyo;
    }

    abstract void obtenerDetalles();

}
