package com.mauricio_pc.pokemon_service.config;


import com.mauricio_pc.pokemon_service.model.Pokemon;
import com.mauricio_pc.pokemon_service.repository.PokemonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final PokemonRepository pokemonRepository;

    public DataLoader(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Borramos todo primero (opcional, para test limpio)
        pokemonRepository.deleteAll();

        // Creamos un nuevo Pokémon
        Pokemon pikachu = new Pokemon();
        pikachu.setNombre("Pikachu");
        pikachu.setTipo("Eléctrico");
        pikachu.setNivel(25);

        // Lo guardamos
        pokemonRepository.save(pikachu);

        // Lo recuperamos e imprimimos
        System.out.println("📥 Pokémon guardado:");
        pokemonRepository.findAll().forEach(pokemon ->
                System.out.println("➡️ ID: " + pokemon.getId() +
                        ", Nombre: " + pokemon.getNombre() +
                        ", Tipo: " + pokemon.getTipo() +
                        ", Nivel: " + pokemon.getNivel()));
    }
}
