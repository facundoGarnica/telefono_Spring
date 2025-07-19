package telefono.Service_Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import telefono.Models.Telefono;
import telefono.Repository.TelefonoRepository;
import telefono.Service.TelefonoService;

import org.springframework.stereotype.Service;
@Service
public class TelefonoServiceImplementation implements TelefonoService{
	@Autowired
	TelefonoRepository telefonoRepository;
	
	@Override
	public List<Telefono> obtenerTodos(){
		return telefonoRepository.findAll();
	}
	@Override
	public Telefono buscarPorId(Long id) {
		return telefonoRepository.findById(id).orElse(null);
	}
	@Override
	public Telefono guardar (Telefono telefono) {
		return telefonoRepository.save(telefono);
	}
	@Override
	public void eliminar (Long id) {
		telefonoRepository.deleteById(id);
	}
}
