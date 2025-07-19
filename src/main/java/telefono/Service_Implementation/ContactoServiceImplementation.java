package telefono.Service_Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import telefono.Models.Contacto;
import telefono.Repository.ContactoRepository;
import telefono.Service.ContactoService;

import org.springframework.stereotype.Service;
@Service
public class ContactoServiceImplementation implements ContactoService{
	@Autowired
	ContactoRepository contactoRepository;
	
	@Override
	public List<Contacto> obtenerTodos(){
		return contactoRepository.findAll();
	}
	@Override
	public Contacto buscarPorId(Long id) {
		return contactoRepository.findById(id).orElse(null);
	}
	@Override
	public Contacto guardar (Contacto contacto) {
		return contactoRepository.save(contacto);
	}
	public void eliminar (Long id) {
		contactoRepository.deleteById(id);
	}
}
