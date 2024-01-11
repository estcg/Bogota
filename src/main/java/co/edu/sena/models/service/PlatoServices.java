package co.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import co.edu.sena.models.entity.Plato;

public interface PlatoServices {
	
	public Optional<Plato>findById(Integer id);
	public List<Plato>findAll();
	public Plato save (Plato e);
	public void deleteById(Integer id);
	
}
