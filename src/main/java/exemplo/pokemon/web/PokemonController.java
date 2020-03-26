package exemplo.pokemon.web;

import exemplo.pokemon.request.PokemonRequest;
import exemplo.pokemon.response.PokemonResponse;
import exemplo.pokemon.service.*;
import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

/**
 * Used to expose application
 */
@RestController
@RequestMapping(value = "/pokemon")
@AllArgsConstructor
public class PokemonController {

    private PokemonSaveService pokemonSaveService;

    private PokemonSearchService pokemonSearchService;

    private PokemonUpdateService pokemonUpdateService;

    private PokemonDeleteService pokemonDeleteService;

    private PokemonFightService pokemonFightService;

    @PostMapping
    public ResponseEntity<Void> savePokemon(@RequestBody PokemonRequest request) {
        pokemonSaveService.savePokemon(request);
        return new ResponseEntity<>(null, CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PokemonResponse>> getPokemon() {
        return new ResponseEntity<>(pokemonSearchService.getPokemon(), OK);
    }

    @PutMapping
    public ResponseEntity<Void> updatePokemon(@RequestBody PokemonRequest request) throws NotFoundException {
        pokemonUpdateService.updatePokemon(request);
        return new ResponseEntity<>(null, NO_CONTENT);
    }

    @DeleteMapping
    public ResponseEntity<Void> deletePokemon(@RequestBody PokemonRequest request) {
        pokemonDeleteService.deletePokemon(request);
        return new ResponseEntity<>(null, NO_CONTENT);
    }

    @GetMapping("/battle")
    public ResponseEntity<PokemonResponse> fightPokemon(@RequestParam Long pokemonOne, @RequestParam Long pokemonTwo){
        return new ResponseEntity<>(pokemonFightService.fightPokemon(pokemonOne, pokemonTwo), OK);

    }





}
