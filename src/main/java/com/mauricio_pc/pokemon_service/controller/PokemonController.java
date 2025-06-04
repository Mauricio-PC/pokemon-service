package com.mauricio_pc.pokemon_service.controller;

import com.mauricio_pc.pokemon_service.model.Pokemon;
import com.mauricio_pc.pokemon_service.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService service;

    @GetMapping
    public List<Pokemon> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Pokemon> getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Pokemon create(@RequestBody Pokemon pokemon) {
        return service.save(pokemon);
    }

    @PutMapping("/{id}")
    public Pokemon update(@PathVariable Long id, @RequestBody Pokemon pokemon) {
        pokemon.setId(id);
        return service.save(pokemon);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
