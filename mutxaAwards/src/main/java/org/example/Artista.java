package org.example;

import java.util.ArrayList;

public class Artista extends MutxaAwards implements AccionesAsistentes{



    private String nombre;
    private ArrayList<Premio> listaPremios;
    private ArrayList<Categoria> categorias;

    public Artista(int edicion, String nombre, ArrayList<Premio> listaPremios, ArrayList<Categoria> categorias) {
        super(edicion);
        this.nombre = nombre;
        listaPremios = new ArrayList<>(listaPremios);
        categorias = new ArrayList<>(categorias);
    }

    public ArrayList<Premio> getListaPremios() {
        return listaPremios;
    }

    public void setListaPremios(ArrayList<Premio> listaPremios) {
        this.listaPremios = listaPremios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public void agregarPremio(Premio premio) {
        listaPremios.add(premio);
    }

    public void agregarCategoria(Categoria categoria){
        categorias.add(categoria);
    }

    public Artista(int edicion, String nombre) {
        super(edicion);
        this.nombre=nombre;
        listaPremios = new ArrayList<>();
        categorias = new ArrayList<>();
    }

    public void esNominado(Categoria categoria) {
        System.out.println(nombre + " ha sido nominado!!!");
    }

    public void ganarPremio(Premio premio) {
        System.out.println(nombre + " ha ganado el premio de la categoría " + premio.getCategoria());
        this.agregarPremio(premio);
        premio.setGanador(this);
    }

    public void recogerPremio(Premio premio) {
        try{
            for (Premio pre : listaPremios) {
                if (pre == premio) {
                    System.out.println(nombre + " ha ido a recoger su premio de categoría " + premio.getCategoria() + " que ha ganadooo!!");
                    return;
                }
            }
            throw new PremioNoGanadoException();
        }catch (PremioNoGanadoException e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void aplaudir() {
        System.out.println(nombre + " se ha puesto a aplaudirrrr!");
    }

    @Override
    public void alfombraRoja() {
        System.out.println(nombre + " se está luciendo por la alfombra rojaaa");
    }

    @Override
    public void darDiscurso(String tematica) {
        System.out.println(nombre + " comienza un grandioso discurso sobre " + tematica);
    }

    @Override
    public void celebrarPremio(Premio premio) {
        System.out.println(nombre + " celebra con mucha alegría el premio " + premio.getCategoria());
    }

    @Override
    void obtenerDetalles() {
        System.out.println("Artista{" +
                "nombre='" + nombre + '\'' +
                ", listaPremios=" + listaPremios +
                ", categorias=" + categorias +
                ", edición=" + edicion +
                '}');
    }
    @Override
    public String toString() {
        return "Artista{" +
                "nombre='" + nombre + '\'' +
                ", listaPremios=" + listaPremios +
                ", categorias=" + categorias +
                ", edicion=" + edicion +
                '}';
    }
}
