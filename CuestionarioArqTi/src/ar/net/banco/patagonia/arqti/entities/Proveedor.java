package ar.net.banco.patagonia.arqti.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Proveedor")
public class Proveedor {
	
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ProveedorId")
	private int proveedorId;

	@Column(name = "Empresa")
	private String empresa;

	@Column(name = "Nombre")
	private String nombre;

	@Column(name = "Apellido")
	private String apellido;

	@Column(name = "Email")
	private String email;

	@Column(name = "Telefono")
	private String telefono;
	
	@Column(name = "Descripcion")
	private String descripcion;

	@ManyToMany
	private Set<Proyecto> proyectos = new HashSet<Proyecto>();

	public Proveedor() {
	}
	
	

	public Set<Proyecto> getProyectos() {
		return proyectos;
	}



	public void setProyectos(Set<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}



	public Proveedor(String empresa, String nombre, String apellido, String email, String telefono) {
		
		this.empresa = empresa;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
	}



	public int getId() {
		return proveedorId;
	}

	public void setId(int id) {
		this.proveedorId = id;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
