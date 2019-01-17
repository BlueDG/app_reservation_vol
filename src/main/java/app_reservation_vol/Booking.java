package app_reservation_vol;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "booking_seq")
	private Integer id;

	@Column
	private Integer booking_number;

	@Column
	private String lastname;

	@Column
	private String firstname;

	@Column
	private Integer age;

@ManyToOne
private Flight flight;
	
	public Booking() {
			this.booking_number = null;
			this.lastname = null;
			this.firstname = null;
			this.age = null;
		}

	public Booking(Integer booking_number, String lastname, String firstname, Integer age) {
		this.booking_number = booking_number;
		this.lastname = lastname;
		this.firstname = firstname;
		this.age = age;
		}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getBooking_number() {
		return booking_number;
	}

	public void setBooking_number(Integer booking_number) {
		this.booking_number = booking_number;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}



}
