package telefono.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import telefono.Models.Persona;
import telefono.Service.PersonaService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;


    @GetMapping("/todos")
    public List<Persona> obtenerTodos() {
        return personaService.obtenerTodos();
    }


    @GetMapping("/buscarporid/{id}")
    public Persona buscarPorId(@PathVariable Long id) {
        return personaService.buscarPorId(id);
    }


    @PostMapping("/guardar")
    public Persona guardar(@RequestBody Persona persona) {
        return personaService.guardar(persona);
    }


    @DeleteMapping("/eliminar")
    public void eliminar(@PathVariable  Long id) {
        personaService.eliminar(id);
    }
}
