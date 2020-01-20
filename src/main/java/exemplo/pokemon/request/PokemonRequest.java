package exemplo.pokemon.request;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PokemonRequest {

    private Long idPokemon;

    private String nomePokemon;

}