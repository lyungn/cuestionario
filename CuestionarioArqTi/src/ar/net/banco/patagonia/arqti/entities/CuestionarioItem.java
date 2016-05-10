package ar.net.banco.patagonia.arqti.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CuestionarioItem")
public class CuestionarioItem {

	public CuestionarioItem() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CuestionarioItemId")
	private int cuestionarioItemId;

	@Column(name = "Descripcion")
	private String descripcion;

	@Column(name = "Titulo")
	private String titulo;

	@Column(name = "Aclaracion")
	private String Aclaracion;

	@Column(name = "Necesidad")
	private String necesidad;
	
	@Column(name = "Calificacion")
	private Integer calificacion;

	@ManyToOne(cascade = CascadeType.ALL)
	private Proyecto proyecto;

	/*
	 * @JoinColumn(name="ProyectoId") public Proyecto getCategory() { return
	 * proyecto; }
	 */

	// private Proyecto proyecto;
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public Proyecto getDepartment() {
		return proyecto;
	}

	public int getCuestionarioItemId() {
		return cuestionarioItemId;
	}

	public void setCuestionarioItemId(int cuestionarioItemId) {
		this.cuestionarioItemId = cuestionarioItemId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAclaracion() {
		return Aclaracion;
	}

	public void setAclaracion(String aclaracion) {
		Aclaracion = aclaracion;
	}

	public String getNecesidad() {
		return necesidad;
	}

	public void setNecesidad(String necesidad) {
		this.necesidad = necesidad;
	}

	public Integer getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}
}
