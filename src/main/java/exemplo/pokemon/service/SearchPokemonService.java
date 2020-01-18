package exemplo.pokemon.service;

import exemplo.pokemon.entity.PokemonEntity;
import exemplo.pokemon.repository.PokemonRepository;
import exemplo.pokemon.response.PokemonResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class SearchPokemonService {

    public PokemonRepository repository;

    /**
     * Should search all pokemon
     */
    public List<PokemonResponse> getPokemon() {
        List<PokemonEntity> pokemonResponse = (List<PokemonEntity>) repository.findAll();
        List<PokemonResponse> response = new ArrayList<>();
        pokemonResponse.forEach(pokemon -> response.add(PokemonResponse.builder()
                .idPokemon(pokemon.getIdPokemon())
                .nomePokemon(pokemon.getNomePokemon())
                .build()));
        return response;
    }
}
