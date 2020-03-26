package exemplo.pokemon.service;

import exemplo.pokemon.entity.PokemonEntity;
import exemplo.pokemon.repository.PokemonRepository;
import exemplo.pokemon.response.PokemonResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PokemonFightService {

    private PokemonRepository repository;

    public PokemonResponse fightPokemon(Long idOne, Long idTwo) {

        //Procura por pokemon 1
        PokemonEntity pokemonOne = repository.findById(idOne).get();

        //Procura por pokemon 2
        PokemonEntity pokemonTwo = repository.findById(idTwo).get();

        //Vida menos poder pokemon 1
        Long resultLifePokemonOne = pokemonOne.getVidaPokemon() - pokemonTwo.getPoderPokemon();

        //Vida menos poder pokemon 2
        Long resultLifePokemonTwo = pokemonTwo.getVidaPokemon() - pokemonOne.getPoderPokemon();

        //Retorna pokemon com mais vida e da ele como vencedor
        if (resultLifePokemonOne < resultLifePokemonTwo) {
            return PokemonResponse.builder()
                    .idPokemon(pokemonOne.getIdPokemon())
                    .nomePokemon(pokemonOne.getNomePokemon())
                    .poderPokemon(pokemonOne.getPoderPokemon())
                    .tipoPokemon(pokemonOne.getTipoPokemon())
                    .vidaPokemon(pokemonOne.getVidaPokemon())
                    .build();
        } else {
            return PokemonResponse.builder()
                    .idPokemon(pokemonTwo.getIdPokemon())
                    .nomePokemon(pokemonTwo.getNomePokemon())
                    .poderPokemon(pokemonTwo.getPoderPokemon())
                    .tipoPokemon(pokemonTwo.getTipoPokemon())
                    .vidaPokemon(pokemonTwo.getVidaPokemon())
                    .build();
        }

    }
}
