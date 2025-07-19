package telefono.Service_Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import telefono.Models.Persona;
import telefono.Repository.PersonaRepository;
import telefono.Service.PersonaService;

import org.springframework.stereotype.Service;
@Service
public class PersonaServiceImplementation implements PersonaService{
	@Autowired
	PersonaRepository personaRepository;
	@Override
	public List<Persona> obtenerTodos(){
		return personaRepository.findAll();
	}
	@Override
	public Persona buscarPorId(Long id) {
		return personaRepository.findById(id).orElse(null);
	}
	@Override
	public Persona guardar (Persona persona) {
		return personaRepository.save(persona);
	}
	@Override
	public void eliminar (Long id) {
		personaRepository.deleteById(id);
	}
}
