package telefono.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import telefono.Models.Contacto;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto,Long>{

}
