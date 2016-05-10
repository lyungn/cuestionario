package ar.net.banco.patagonia.arqti.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;


@Entity
@Table(name = "Proyecto")
public class Proyecto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ProyectoId")
	private int proyectoId;

	@Column(name = "Descripcion")
	private String descripcion;

	@Column(name = "FechaInicio")
	private Date fechaInicio;

	@Column(name = "FechaFin")
	private Date fechaFin;
	
	//private Set<CuestionarioItem> cuestionarioItems;

	/*@OneToMany(mappedBy = "cuestionarioItem", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CuestionarioItem> cuestionarioItems = new ArrayList<>();
    public Set<CuestionarioItem> getCuestionarioItems()  {
    	return cuestionarioItems;
    }

	public List<CuestionarioItem> getCuestionarioItems() {
        return cuestionarioItems;
    }
	
	public void addCuestionarioItem(CuestionarioItem cuestionarioItem) {
		cuestionarioItems.add(cuestionarioItem);
		cuestionarioItem.setProyecto(this);
    }
	
	public void removeCuestionarioItem (CuestionarioItem cuestionarioItem) {
		cuestionarioItem.setProyecto(null);
        this.cuestionarioItems.remove(cuestionarioItem);
    }
    */
	
	
	public Proyecto() {
	}
	

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ProyectoProveedor", joinColumns = @JoinColumn(name = "ProyectoId"), inverseJoinColumns = @JoinColumn(name = "ProveedorId"))
	private Set<Proveedor> proveedores = new HashSet<Proveedor>();

	public int getProyectoId() {
		return proyectoId;
	}

	
	public void setProyectoId(int proyectoId) {
		this.proyectoId = proyectoId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Set<Proveedor> getProveedores() {
		return proveedores;
	}

	public void setProveedores(Set<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}


}
