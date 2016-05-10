package ar.net.banco.patagonia.arqti.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ar.net.banco.patagonia.arqti.entities.Proveedor;

public class TestDb {


	    public static void main(String[] args) {

	        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Arqti");
	        EntityManager entityManager = entityManagerFactory.createEntityManager();

	        // Add a new record to corporation
	        Proveedor corporation = new Proveedor();
	        //corporation.setId(1);
	        corporation.setNombre("Extra Corp");
	        corporation.setApellido("AAA");
	        corporation.setDescripcion("Extra industrial multinational corporation");
	        corporation.setEmpresa("555 Extra Way, Acropolis CA");
	        corporation.setTelefono("90267");
	        corporation.setEmail("pepe@gmail.com");
	        
	        try {
	            entityManager.getTransaction().begin();
	            entityManager.persist(corporation);
	            entityManager.getTransaction().commit();
	        } catch (RuntimeException e) {
	             e.printStackTrace();
	             entityManager.getTransaction().rollback();
	        }

	        try {
	        	Proveedor corp3 = entityManager.find(Proveedor.class, 1);
	            System.out.println("Corp 3 name: " + corp3.getNombre() + " Zipcode: " + corp3.getTelefono());
	            //Proveedor corp5 = entityManager.find(Proveedor.class, 5);
	            //System.out.println("Corp 5 name: " + corp5.getName() + " Zipcode: " + corp5.getZipcode());
	        } catch (RuntimeException e) {
	             e.printStackTrace();
	             entityManager.getTransaction().rollback();
	        } finally {
	             entityManager.close();
	        }
	    }

}
