package ar.net.banco.patagonia.arqti.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ar.net.banco.patagonia.arqti.entities.CuestionarioItem;

public class CuestionarioDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Arqti");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	List<CuestionarioItem> cuestionario = new ArrayList<CuestionarioItem>();

	private List<CuestionarioItem> seleccionaCuestionarioPorId(Integer proyectId) {

		CuestionarioItem cuestionarioItem = entityManager.find(CuestionarioItem.class, 1);
		cuestionario.add(cuestionarioItem);

		return cuestionario;
	}

	public List<CuestionarioItem> leerCuestionario(Integer proyectId) {
		return seleccionaCuestionarioPorId(proyectId);
	}

	public void setCuestionario(List<CuestionarioItem> cuestionario) {
		this.cuestionario = cuestionario;
	}

}
