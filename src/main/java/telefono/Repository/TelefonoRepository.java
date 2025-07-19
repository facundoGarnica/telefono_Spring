package telefono.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import telefono.Models.Telefono;
@Repository
public interface TelefonoRepository extends JpaRepository<Telefono,Long>{

}
