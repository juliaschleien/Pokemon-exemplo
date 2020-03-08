package exemplo.pokemon.service;


import exemplo.pokemon.entity.PokemonEntity;
import exemplo.pokemon.repository.PokemonRepository;
import exemplo.pokemon.request.PokemonRequest;
import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PokemonUpdateService {

    private PokemonRepository repository;

    /**
     * metodo utilizado para atualizar pokemons
     * @param request
     */
    public void updatePokemon(PokemonRequest request) throws NotFoundException {

        pokemonValidator(request);

        //montando objeto para mandar para banco de dados
        PokemonEntity pokemon = PokemonEntity.builder()
                .idPokemon(request.getIdPokemon())
                .nomePokemon(request.getNomePokemon())
                .build();

        //fazendo update de pokemon existente
        repository.save(pokemon);
    }


    /**
     * Validando se pokemon existe
     * @param request
     * @throws NotFoundException
     */
    private void pokemonValidator(PokemonRequest request) throws NotFoundException {
        if(repository.findById(request.getIdPokemon()).isEmpty()){
            throw new NotFoundException("Pokemon não encontrado, encerrando processo");
        }
    }
}
