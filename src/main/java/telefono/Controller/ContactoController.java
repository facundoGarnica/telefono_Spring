package telefono.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import telefono.Models.Contacto;
import telefono.Service.ContactoService;

@RestController
@RequestMapping("/contacto")

public class ContactoController {
	@Autowired
	ContactoService contactoService;
	
	@GetMapping("/todos")
	public List<Contacto> obtenerTodos(){
		return contactoService.obtenerTodos();
	}
	@GetMapping("/buscarporid")
	public Contacto buscarPorId(Long id) {
		return contactoService.buscarPorId(id);
	}
	@PostMapping("/guardar")
	public Contacto guardar(@RequestBody Contacto contacto) {
		return contactoService.guardar(contacto);
	}
	@PostMapping("/eliminar")
	public void eliminar(@PathVariable  Long id) {
		contactoService.eliminar(id);
	}
}
