package Programa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Classes.Pessoa;

public class Aplicação {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null, "Lucas", "Lucas-berto@hotmail.com");
		Pessoa p2 = new Pessoa(null, "Davi", "Davi-berto@hotmail.com");
		Pessoa p3 = new Pessoa(null, "Sandra", "Sandra-berto@hotmail.com");
		Pessoa p4 = new Pessoa(null, "Berto", "Berto-berto@hotmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);

		em.getTransaction().commit();

		System.out.println("Commited!");

		  /*
		 * Pessoa p = em.find(Pessoa.class, 8);
		 * 
		 * System.out.println(p);
		 */

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

	}

}
