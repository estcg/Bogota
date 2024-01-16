package co.edu.sena.models.service;

import co.edu.sena.models.entity.Usuario;

public interface UsuarioService {
	
	public Usuario save(Usuario u);
	public String login(String user, String ctr);
	

}
