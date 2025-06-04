package com.mauricio_pc.pokemon_service.repository;

import com.mauricio_pc.pokemon_service.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
    // Puedes agregar métodos personalizados si hace falta, por ahora nos basta el CRUD básico
}
/**
 * 🔍 ¿Qué hace esto?
 * Extiende JpaRepository<Pokemon, Long>, lo cual te da automáticamente métodos como:
 * findAll()
 * findById(id)
 * save(pokemon)
 * deleteById(id)
 * … sin escribir nada más.
 **/