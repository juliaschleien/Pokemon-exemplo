package exemplo.pokemon.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PokemonResponse {

    private Long idPokemon;

    private String nomePokemon;

}