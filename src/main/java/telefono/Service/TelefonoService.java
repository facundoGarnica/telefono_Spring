package telefono.Service;

import java.util.List;

import telefono.Models.Telefono;

public interface TelefonoService {
	List<Telefono> obtenerTodos();
	Telefono buscarPorId(Long id);
	Telefono guardar (Telefono telefono);
	Telefono buscarPorPersona(Long id);
	void eliminar (Long id);
}
