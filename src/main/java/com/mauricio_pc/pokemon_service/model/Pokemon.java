// src/main/java/com/mauricio/pokemonservice/model/Pokemon.java
package com.mauricio_pc.pokemon_service.model;

import javax.persistence.*;

@Entity
@Table(name = "pokemons")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String tipo;
    private int nivel;

    // Constructor vacío para JPA
    public Pokemon() {
    }

    public Pokemon(String nombre, String tipo, int nivel) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
/**
 * 📚 Explicación a fondo
 *
 * @Entity: indica que esta clase se mapeará a una tabla en la BD.
 * @Table(name = "pokemons"): personaliza el nombre de la tabla.
 * @Id: es la clave primaria.
 * @GeneratedValue(...): delegamos al motor (MySQL) la generación del ID.
 * Campos como nombre, tipo, nivel: representan las propiedades básicas de un Pokémon.
 * Constructor vacío: lo requiere JPA.
 * Constructor lleno: útil para crear instancias más fácilmente.
 * Getters y setters: para encapsular los campos.
 **/