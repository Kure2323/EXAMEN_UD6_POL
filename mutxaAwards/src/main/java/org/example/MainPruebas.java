package org.example;

public class MainPruebas {

    public static void main(String[] args) {
        Artista artista = new Artista(2025, "Pepito");
        Presentador presentador = new Presentador(2025, "Juan");
        Premio premio = new Premio(2025, Categoria.MEJOR_GUION);

        //Métodos de la interfaz
        artista.aplaudir();
        artista.alfombraRoja();
        artista.darDiscurso("Elefantes");
        artista.celebrarPremio(new Premio(2025, Categoria.MEJOR_ACTRIZ));

        //Ahora los propios
        artista.esNominado(Categoria.MEJOR_ACTRIZ);
        //Antes de ganarlo
        artista.recogerPremio(premio);
        //Después de ganarlo
        artista.ganarPremio(premio);
        artista.recogerPremio(premio);

        //Método de la interfaz de Presentador
        presentador.aplaudir();
        presentador.alfombraRoja();
        presentador.darDiscurso("Patitos monis");
        presentador.celebrarPremio(premio);
        //Propios de Presentador
        presentador.presentar();
        presentador.entregarPremio(premio);

        //Métodos de premio
        premio.obtenerDetalles();


    }

}
