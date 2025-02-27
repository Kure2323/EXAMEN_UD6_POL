package org.example;

public class Presentador extends MutxaAwards implements AccionesAsistentes{

    private String nombre;

    public Presentador(int edicion, String nombre) {
        super(edicion);
        this.nombre = nombre;
    }


    public void presentar() {
        System.out.println("El presentador el día de hoy seráaaaa.... " + nombre);
    }

    public void entregarPremio(Premio premio) {
        System.out.println(nombre + ", el presentador, está entregando el premio " + premio);
    }

    @Override
    public void aplaudir() {
        System.out.println("El presentador " + nombre + " ha comenzado a aplaudir!!");
    }

    @Override
    public void alfombraRoja() {
        System.out.println("Hasta el presentador " + nombre + " se luce en la alfombra rojaaa!!");
    }

    @Override
    public void darDiscurso(String tematica) {
        System.out.println("El presentador " + nombre + " comienza su discurso sobre " + tematica);
    }

    @Override
    public void celebrarPremio(Premio premio) {
        System.out.println("El presentador " + nombre + " celebra el premio " + premio);
    }

    @Override
    void obtenerDetalles() {
        System.out.println("Presentador{" +
                "nombre='" + nombre + '\'' +
                ", edicion=" + edicion +
                '}');
    }
}
