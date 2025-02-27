package org.example;

public class Premio extends MutxaAwards{

    private Categoria categoria;
    private Artista ganador;

    public Premio(int edicion, Categoria categoria, Artista ganador) {
        super(edicion);
        this.categoria = categoria;
        this.ganador = ganador;
    }

    public Premio(int anyo, Categoria categoria) {
        super(anyo);
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getGanador() {
        return ganador.getNombre();
    }

    public void setGanador(Artista ganador) {
        this.ganador = ganador;
    }

    @Override
    void obtenerDetalles() {
        System.out.println("Premio{" +
                "categoria=" + categoria +
                ", ganador=" + ganador +
                ", edicion=" + edicion +
                '}');
    }
}
