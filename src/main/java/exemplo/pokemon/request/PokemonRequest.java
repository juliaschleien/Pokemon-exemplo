package exemplo.pokemon.request;

import lombok.*;

import javax.persistence.Column;

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

    private Long vidaPokemon;

    private Long poderPokemon;

    private String tipoPokemon;
}