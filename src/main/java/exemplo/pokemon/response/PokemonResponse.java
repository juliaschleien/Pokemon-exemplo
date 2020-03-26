package exemplo.pokemon.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Used to map response bodies
 */
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PokemonResponse {

    private Long idPokemon;

    private String nomePokemon;

    private String tipoPokemon;

    private Long vidaPokemon;

    private Long poderPokemon;

}