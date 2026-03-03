package com.example4.pokemon4_service.service;

import com.example4.pokemon4_service.model.Pokemon;
import com.example4.pokemon4_service.repository.IFeignPokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    @Autowired
    private IFeignPokemonRepository pokemonRepository;

    public Pokemon getPokemon(int id) {
       return pokemonRepository.getPokemon(id);
    }


}
