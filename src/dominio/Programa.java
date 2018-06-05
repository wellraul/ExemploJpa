package dominio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		Pessoa p1 = new Pessoa(null, "Wellington Raul");
		Pessoa p2 = new Pessoa(null, "Murilo Zoratti");
		Pessoa p3 = new Pessoa(null, "Bruno");
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        System.out.println("pronto");
	}

}
