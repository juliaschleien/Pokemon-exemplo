package exemplo.pokemon.service;

import exemplo.pokemon.entity.PokemonEntity;
import exemplo.pokemon.repository.PokemonRepository;
import exemplo.pokemon.request.PokemonRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Used to centralize business rule
 */
@Service
@AllArgsConstructor
public class PokemonSaveService {

    public PokemonRepository repository;

    /**
     * Should save new pokemon
     */
    public void savePokemon(PokemonRequest request) {

        // montando um objeto para salvar no banco
        PokemonEntity pokemonSalvar = PokemonEntity.builder()
                .idPokemon(request.getIdPokemon())
                .nomePokemon(request.getNomePokemon())
                .build();

        // salvando o objeto
        repository.save(pokemonSalvar);
    }
}
