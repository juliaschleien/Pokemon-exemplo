package exemplo.pokemon.web;

import exemplo.pokemon.request.PokemonRequest;
import exemplo.pokemon.response.PokemonResponse;
import exemplo.pokemon.service.PokemonSaveService;
import exemplo.pokemon.service.SearchPokemonService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

/**
 * Used to expose application
 */
@RestController
@RequestMapping(value = "/pokemon")
@AllArgsConstructor
public class PokemonController {

    public PokemonSaveService saveService;

    public SearchPokemonService searchPokemonService;

    @PostMapping
    public ResponseEntity<Void> savePokemon(@RequestBody PokemonRequest request) {
        saveService.savePokemon(request);
        return new ResponseEntity<>(null, CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PokemonResponse>> getPokemon() {
        return new ResponseEntity<>(searchPokemonService.getPokemon(), OK);
    }

}
