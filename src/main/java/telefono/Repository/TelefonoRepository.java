package telefono.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import telefono.Models.Telefono;
@Repository
public interface TelefonoRepository extends JpaRepository<Telefono,Long>{

	 List<Telefono> findByPersonaId(Long personaId);
	
}
