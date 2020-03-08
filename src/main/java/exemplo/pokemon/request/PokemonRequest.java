package exemplo.pokemon.request;

import lombok.*;

/**
 * Used to map request bodies
 */
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PokemonRequest {

    private Long idPokemon;

    private String nomePokemon;

}