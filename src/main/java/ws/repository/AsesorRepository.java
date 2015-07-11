package ws.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ws.models.Asesor;

/**
 * Created by matedeilo on 7/10/15.
 */
@Repository
public interface AsesorRepository extends CrudRepository<Asesor, Integer> {

    Asesor findByNombre(String nombre);

}
