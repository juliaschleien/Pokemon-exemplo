package exemplo.pokemon.repository;

import exemplo.pokemon.entity.PokemonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Used to manage queries
 */
@Repository
public interface PokemonRepository extends CrudRepository<PokemonEntity, Long> {
}
