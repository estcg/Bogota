package co.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.sena.models.entity.Plato;
import co.edu.sena.repository.PlatoRepository;

@Service
public class PlatoServicesImpl implements PlatoServices{
	
	@Autowired
	PlatoRepository platoRepository;

	@Override
	public Optional<Plato> findById(Integer id) {
		
		return platoRepository.findById(id);
	}

	@Override
	public List<Plato> findAll() {
		
		return platoRepository.findAll();
	}

	@Override
	public Plato save(Plato e) {
		
		return platoRepository.save(e);
	}

	@Override
	public void deleteById(Integer id) {
		platoRepository.deleteById(id);
		
	}

}
