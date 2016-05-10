package ar.net.banco.patagonia.arqti.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import ar.net.banco.patagonia.arqti.entities.CuestionarioItem;
import ar.net.banco.patagonia.arqti.entities.Proveedor;
import ar.net.banco.patagonia.arqti.entities.Proyecto;



public class ProyectoTest {

	@Test
	public void test() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Arqti");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
		Proyecto proyecto = new Proyecto();
		proyecto.setDescripcion("proyectoPrueba");
		proyecto.setFechaInicio(new Date());
		proyecto.setFechaFin(new Date());
		
		Set<Proveedor> proveedores = new HashSet<Proveedor>();
		Proveedor proveedor = new Proveedor();
		proveedor.setApellido("Gomez");
		proveedor.setNombre("Juan");
		proveedor.setDescripcion("PM");
		proveedor.setEmail("xx@gmail.com");
		proveedor.setEmpresa("SuperSoft");
		proveedor.setTelefono("123456789");
		proveedores.add(proveedor);
		proyecto.setProveedores(proveedores);
		
		CuestionarioItem cuestionarioItem = new CuestionarioItem();
		cuestionarioItem.setProyecto(proyecto);
		cuestionarioItem.setDescripcion("Debe ser compatible com Windows 10");
		cuestionarioItem.setNecesidad("REQUERIDO");
		cuestionarioItem.setTitulo("CompatibleWindows10");
		
		
		
		try {
			entityManager.getTransaction().begin();
			
			entityManager.persist(proyecto);
			
			entityManager.persist(cuestionarioItem);
			entityManager.getTransaction().commit();
        } catch (RuntimeException e) {
             e.printStackTrace();
             entityManager.getTransaction().rollback();
        }

	}

}
