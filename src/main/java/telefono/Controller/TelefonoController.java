package telefono.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import telefono.Models.Telefono;
import telefono.Service.TelefonoService;

@RestController
@RequestMapping("/telefono")
public class TelefonoController  {
	@Autowired
	TelefonoService telefonoService;
	
	@GetMapping("/todos")
	public List<Telefono> obtenerTodos(){
		return telefonoService.obtenerTodos();
	}
	@GetMapping("/buscarporid")
	public Telefono buscarPorId(Long id) {
		return telefonoService.buscarPorId(id);
	}
	@PostMapping("/guardar")
	public Telefono guardar(@RequestBody Telefono telefono) {
		return telefonoService.guardar(telefono);
	}
	@PostMapping("/eliminar")
	public void eliminar(@PathVariable  Long id) {
		telefonoService.eliminar(id);
	}
}
