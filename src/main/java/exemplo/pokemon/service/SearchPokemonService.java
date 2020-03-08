package exemplo.pokemon.service;

import exemplo.pokemon.entity.PokemonEntity;
import exemplo.pokemon.repository.PokemonRepository;
import exemplo.pokemon.response.PokemonResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Used to centralize business rule
 */
@Service
@AllArgsConstructor
public class SearchPokemonService {

    public PokemonRepository repository;

    /**
     * Should search all pokemon
     */
    public List<PokemonResponse> getPokemon() {

        //procurando pokemons
        List<PokemonEntity> pokemonResponseList = (List<PokemonEntity>) repository.findAll();

        //criando lista para retornar
        List<PokemonResponse> response = new ArrayList<>();

        //percorrendo a lista de retorno do banco
        pokemonResponseList.forEach(pokemon -> {

            //criando objeto para retornar
            PokemonResponse pokemonResponse = PokemonResponse.builder()
                    .idPokemon(pokemon.getIdPokemon())
                    .nomePokemon(pokemon.getNomePokemon())
                    .build();

            //adc retorno
            response.add(pokemonResponse);
        });

        return response;
    }
}
