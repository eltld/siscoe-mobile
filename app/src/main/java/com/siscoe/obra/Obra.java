package com.siscoe.obra;

/**
 * Created by manuonda on 07/06/15.
 */
public class Obra {

    private Long idObra;
    private String nombre;
    private String descripcion;
    private String fechaPublicacion;


    public Obra(Long idObra, String nombre, String descripcion, String fechaPublicacion) {
        this.idObra = idObra;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaPublicacion = fechaPublicacion;
    }

    public Long getIdObra() {
        return idObra;
    }

    public void setIdObra(Long idObra) {
        this.idObra = idObra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return "Obra{" +
                "idObra=" + idObra +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaPublicacion='" + fechaPublicacion + '\'' +
                '}';
    }
}
