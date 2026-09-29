package com.proyecto.trabajoya.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "categoria_servicios")
public class CategoriaServicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria_servicio")
    private int idCategoriaServicio;

    @Column (nullable = false, length = 50)
    private String nombre;

    @Column (nullable = false, length = 200)
    private String descripcion;

    //servicio
    @OneToMany(mappedBy = "categoria")
    private List<Servicio> servicio;

    public CategoriaServicio() {
    }

    public CategoriaServicio(String nombre, String descripcion, List<Servicio> servicio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.servicio = servicio;
    }

    public CategoriaServicio(int idCategoriaServicio, String nombre, String descripcion, List<Servicio> servicio) {
        this.idCategoriaServicio = idCategoriaServicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.servicio = servicio;
    }

    public int getIdCategoriaServicio() {
        return idCategoriaServicio;
    }

    public void setIdCategoriaServicio(int idCategoriaServicio) {
        this.idCategoriaServicio = idCategoriaServicio;
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

    public List<Servicio> getServicio() {
        return servicio;
    }

    public void setServicio(List<Servicio> servicio) {
        this.servicio = servicio;
    }

    

    

    
}
