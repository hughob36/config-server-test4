package com.example4.pokemon4_service.repository;


import com.example4.pokemon4_service.model.Pokemon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "pokemon-name",url = "https://pokeapi.co/api/v2/")
public interface IFeignPokemonRepository {

    @GetMapping("/pokemon/{id}")
    public Pokemon getPokemon(@PathVariable("id") int id);
}
