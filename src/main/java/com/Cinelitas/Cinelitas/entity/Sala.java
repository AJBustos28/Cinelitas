package com.Cinelitas.Cinelitas.entity;
import java.io.Serializable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;


@Entity
@Table(name="personas")
public class Sala implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id_sala;
    
    private String capacidad;
    private String titulo_pelicula;

    public long getId_sala() {
        return id_sala;
    }

    public void setId_sala(long id_sala) {
        this.id_sala = id_sala;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getTitulo_pelicula() {
        return titulo_pelicula;
    }

    public void setTitulo_pelicula(String titulo_pelicula) {
        this.titulo_pelicula = titulo_pelicula;
    }
    
    
}
