package com.example4.pokemon4_service.controller;

import com.example4.pokemon4_service.model.Pokemon;
import com.example4.pokemon4_service.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/{id}")
    public Pokemon findPokemon(@PathVariable int id) {
        return pokemonService.getPokemon(id);
    }

    @GetMapping("/saludo")
    public String saludo(){
        return "Hola";
    }

}
