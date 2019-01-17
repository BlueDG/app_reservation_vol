package app_reservation_vol;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {

		
		/* *********************************************************************************************************** */
		
		// INPUT UPDATE DELETE IN TAB
		
		/* *********************************************************************************************************** */
		
		Date date = new Date();
		String str = "02-03-2019"; // une date respectant le format défini par le formateur
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); // définit comment s'écrit la date
		try {
			date = formatter.parse(str); // le formateur a pour méthode parse (qui transforme une string respectant le
											// format du formateur en date)
		} catch (ParseException e) {
			e.printStackTrace();
		}

		
		Flight f = new Flight("500", Plane_type.A340, 678, "Paris", "Tokyo", date);
		Vol_dao.CreateFlight(f);
		// f.setFrom("Detroit"); // modification du vol
		// Vol_dao.UpdateFlight(f);
		// Vol_dao.DeleteFlight(f); // suppression du vol
		
		
		Booking b = new Booking(4789, "Dusseux", "Guillaume", 28);
		Booking_dao.CreateBooking(b);

		
		/* *********************************************************************************************************** */
		
		// APPLICATION
		
		/* *********************************************************************************************************** */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n \n \n \n \n \n");
		System.out.println("--- FLIGHT BOOKING ---");
		System.out.println("\n");
		// String entry = sc.nextLine();
		System.out.println("--- MENU ---");
		System.out.println("\n");
		System.out.println("-- 1 FLIGHTS --"); 
		System.out.println("-- 2 BOOKING --");
		System.out.println("-- 3 QUIT --");
		
		Integer entry = Integer.valueOf(sc.nextLine());
		
		switch (entry) {
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
	}

}
