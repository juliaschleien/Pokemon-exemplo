package exemplo.pokemon.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "POKEMON")
public class PokemonEntity {

    @Id
    @Column(name = "ID_POKEMON")
    private long idPokemon;

    @Column(name = "NOME_POKEMON")
    private String nomePokemon;
}
