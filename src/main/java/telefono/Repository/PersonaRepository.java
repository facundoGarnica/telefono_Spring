package telefono.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import telefono.Models.Persona;



@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long>{

}
