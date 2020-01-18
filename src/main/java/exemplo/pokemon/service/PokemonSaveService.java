package exemplo.pokemon.service;

import exemplo.pokemon.entity.PokemonEntity;
import exemplo.pokemon.repository.PokemonRepository;
import exemplo.pokemon.request.PokemonRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PokemonSaveService {

    public PokemonRepository repository;

    /**
     * Should save new pokemon
     */
    public void savePokemon(PokemonRequest request) {
        repository.save(PokemonEntity.builder()
                .idPokemon(request.getIdPokemon())
                .nomePokemon(request.getNomePokemon())
                .build());
    }
}
