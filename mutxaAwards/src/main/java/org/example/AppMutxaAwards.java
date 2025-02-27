package org.example;

import java.util.ArrayList;

public class AppMutxaAwards {
    public static void main(String[] args) {

        Presentador presentador = new Presentador(2025, "Pepe Presentador");
        presentador.obtenerDetalles();

        Artista artista = new Artista(2025, "Adel");
        Artista artista1 = new Artista(2025, "Michael");
        Artista artista2 = new Artista(2025, "David");
        Artista artista3 = new Artista(2025, "Marina");
        Artista artista4 = new Artista(2025, "Elan");
        Artista[] listaArtistas = {artista, artista1, artista2, artista3, artista4};
        presentador.alfombraRoja();
        for (Artista art : listaArtistas) {
            art.alfombraRoja();
        }

        presentador.presentar();
        presentador.darDiscurso("para solidarizarse con los afectados de la DANA");

        Premio premio = new Premio(2025, Categoria.MEJOR_ACTOR);

        for (int i = 0; i < 4; i++) {
            listaArtistas[i].esNominado(Categoria.MEJOR_ACTOR);
            listaArtistas[i].agregarCategoria(Categoria.MEJOR_ACTOR);
        }

        artista1.ganarPremio(premio);
        presentador.aplaudir();
        presentador.celebrarPremio(premio);
        for (Artista art : listaArtistas) {
            art.aplaudir();
            art.celebrarPremio(premio);
        }

        artista2.recogerPremio(premio);

        artista1.recogerPremio(premio);

        presentador.entregarPremio(premio);

        artista1.darDiscurso("el esfuerzo realizado para rodar la película");

        presentador.aplaudir();
        for (Artista art : listaArtistas) {
            art.aplaudir();
        }






    }
}