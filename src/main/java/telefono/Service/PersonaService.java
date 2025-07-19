package telefono.Service;

import java.util.List;

import telefono.Models.Persona;

public interface PersonaService {
	 List<Persona> obtenerTodos();
	 Persona buscarPorId(Long id);
	 Persona guardar (Persona persona);
	 void eliminar(Long id); 
}
