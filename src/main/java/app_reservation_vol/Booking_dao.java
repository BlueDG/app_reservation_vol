package app_reservation_vol;

import javax.persistence.EntityManager;

public class Booking_dao {

	public static void CreateBooking(Booking booking) {

		EntityManager em = DatabaseHelper.createEntityManager(); // Je me connecte à la BDD
		DatabaseHelper.beginTx(em);
		em.persist(booking); // Je "push" le flight dans la BDD
		DatabaseHelper.commitTxAndClose(em); // Je commit "valide" et ferme ma connection

	}

	public static void UpdateBooking(Booking booking) {

		EntityManager em = DatabaseHelper.createEntityManager(); // Je me co à la BDD
		DatabaseHelper.beginTx(em);
		em.merge(booking); // Je modifie ou update mon flight
		DatabaseHelper.commitTxAndClose(em);

	}

	public static void DeleteFlight(Booking booking) {

		EntityManager em = DatabaseHelper.createEntityManager(); // Je me co à la BDD
		DatabaseHelper.beginTx(em);
		Booking findBooking = em.find(Booking.class, booking.getId()); // Je demande à mon em de chercher l'ID de mon flight
		if (findBooking != null) { // Je check si c'est vide ou non (obligatoire pr fonctionner)
			em.remove(findBooking);
		}
		DatabaseHelper.commitTxAndClose(em);
	}

}
