package exemplo.pokemon.repository;

import exemplo.pokemon.entity.PokemonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends CrudRepository<PokemonEntity, Long> {
}
