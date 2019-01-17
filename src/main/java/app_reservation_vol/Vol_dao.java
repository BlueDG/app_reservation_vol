package app_reservation_vol;

import javax.persistence.EntityManager;

public class Vol_dao {

	
	public static void CreateFlight(Flight flight) {
		
		EntityManager em = DatabaseHelper.createEntityManager(); // Je me connecte à la BDD
		DatabaseHelper.beginTx(em);
		em.persist(flight); // Je "push" le flight dans la BDD
		DatabaseHelper.commitTxAndClose(em); // Je commit "valide" et ferme ma connection

	}

	public static void UpdateFlight(Flight flight) {

		EntityManager em = DatabaseHelper.createEntityManager(); // Je me co à la BDD
		DatabaseHelper.beginTx(em);
		em.merge(flight); // Je modifie ou update mon flight
		DatabaseHelper.commitTxAndClose(em);

	}

	public static void DeleteFlight(Flight flight) {
		

		EntityManager em = DatabaseHelper.createEntityManager(); // Je me co à la BDD
		DatabaseHelper.beginTx(em);
		Flight findFlight = em.find(Flight.class, flight.getId()); // Je demande à mon em de chercher l'ID de mon flight
		if(findFlight != null) { // Je check si c'est vide ou non (obligatoire pr fonctionner)
			em.remove(findFlight);
		}
		DatabaseHelper.commitTxAndClose(em);
	}
	
}