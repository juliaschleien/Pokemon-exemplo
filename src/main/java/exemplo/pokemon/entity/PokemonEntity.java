package exemplo.pokemon.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Used to map database structure
 */
@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "POKEMON")
public class PokemonEntity {

    @Id
    @Column(name = "ID_POKEMON")
    private Long idPokemon;

    @Column(name = "NOME_POKEMON")
    private String nomePokemon;

    @Column(name = "VIDA_POKEMON")
    private Long vidaPokemon;

    @Column(name = "PODER_POKEMON")
    private Long poderPokemon;

    @Column(name = "TIPO_POKEMON")
    private String tipoPokemon;
}
