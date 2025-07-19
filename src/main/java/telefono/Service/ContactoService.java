package telefono.Service;

import java.util.List;

import telefono.Models.Contacto;

public interface ContactoService {
	List<Contacto> obtenerTodos();
	Contacto buscarPorId(Long id);
	Contacto guardar (Contacto contacto);
	void eliminar (Long id);
}
