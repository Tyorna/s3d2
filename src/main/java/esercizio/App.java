package esercizio;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import util.JpaUtil;

public class App {

	private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		Evento evento1 = new Evento("Evento3", LocalDate.parse("2024-02-19"), "beach-party", TipoEvento.PRIVATO, 55);
		EventoDAO eDAO1 = new EventoDAO(em);

//		eDAO1.save(evento1);
//		Evento evento2 = new Evento("Evento2", LocalDate.parse("2023-09-13"), "discoteca", TipoEvento.PUBBLICO, 160);
//		eDAO1.save(evento2);

		Evento trova = eDAO1.findById(6);
		System.out.println(trova);

		System.out.println("----");

		eDAO1.delete(7);

		System.out.println("----");

		eDAO1.refresh(5);

		em.close();
		emf.close();
	}

}
