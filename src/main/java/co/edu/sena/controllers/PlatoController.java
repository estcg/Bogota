package co.edu.sena.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.sena.models.entity.Plato;
import co.edu.sena.models.service.PlatoServices;

@RestController
@RequestMapping("/api/platos")
public class PlatoController {
	
	@Autowired
	PlatoServices platoServices;
	
	@GetMapping("/id")
	public Optional<Plato> buscarPorId(@PathVariable Integer id) {
		
		return platoServices.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Plato> listarTodos(){
		
		return platoServices.findAll();
				
	}
	
	@PostMapping
	public Plato guardar (@RequestBody Plato e) {
		
		return platoServices.save(e);
	}
	
	@DeleteMapping("/{id}")
	
	public void eliminar (@PathVariable Integer id) {
		
		platoServices.deleteById(id);
	}
	
	public Plato actualizar (@RequestBody Plato e, @PathVariable Integer id) {
		
		Plato eEnBD= platoServices.findById(id).get();
		
		eEnBD.setCodigo(e.getCodigo());
		eEnBD.setNombre(e.getNombre());
		eEnBD.setPrecio(e.getPrecio());
		
		platoServices.save(eEnBD);
		
		return e;
	}

}
