package exemplo.pokemon.service;


import exemplo.pokemon.repository.PokemonRepository;
import exemplo.pokemon.request.PokemonRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PokemonDeleteService {

    private PokemonRepository repository;

    public void deletePokemon(PokemonRequest request) {
        repository.deleteById(request.getIdPokemon());
    }
}

