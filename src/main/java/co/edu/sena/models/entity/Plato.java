package co.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "platos")

public class Plato {
	
	@Id
	@Column (name = "cod_plato")
	private int codigo;
	
	@Column (name = "nom_plato")
	private String nombre;
	
	@Column (name = "prec_plato")
	private float precio;
	
	
	public Plato(int codigo, String nombre, float precio) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Plato() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	

}
