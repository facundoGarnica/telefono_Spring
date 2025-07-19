package telefono.Models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Persona {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	@OneToMany (mappedBy = "persona", cascade = CascadeType.ALL)
	@JsonManagedReference("persona-telefono")
	private List<Telefono> telefonos;
	public Persona() {
		
	}
	public Long getId() {
		return this.id;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public List<Telefono> getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
