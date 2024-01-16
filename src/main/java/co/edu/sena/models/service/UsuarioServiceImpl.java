package co.edu.sena.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.sena.models.entity.Usuario;
import co.edu.sena.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public Usuario save(Usuario u) {
	
		return usuarioRepository.save(u);
	}

	@Override
	public String login(String user, String ctr) {
		
		Usuario usuario = usuarioRepository.findByUsername(user);
		
		if (usuario == null) {
			return "Usuario no encontrado";
		}
		
		if (!usuario.getPassword().equals(ctr)) {
			return "Contraseña incorrecta";
		}
		return "Inicio de sesion exitoso";
	}
	

	 

}
