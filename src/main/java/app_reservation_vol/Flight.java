package app_reservation_vol;

import java.util.Date;
import java.util.List;

// CTRL + SHIFT + O = ajoute les imports quand tout est souligné en rouge


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
@SequenceGenerator(name="flight_seq", allocationSize=50)
public class Flight {
	
	 @Id
	 @GeneratedValue (strategy=GenerationType.SEQUENCE, generator="flight_seq")
	private Integer id;
	
	@Column
	private String flight_number; 
	 
	@Column
	@Enumerated(EnumType.STRING)
	private Plane_type plane_type;
	
	@Column
	private Integer nb_place;
	
	@Column
	private String fromCity;
	
	@Column
	private String toCity;
	
	@Column
	protected Date departure;
	

	@OneToMany(mappedBy = "flight")
	private List<Booking> bookings; // il fait la liste des réservations


	public Flight() {
		this.flight_number = null;
		this.plane_type = null;
		this.nb_place = null;
		this.fromCity = null;
		this.toCity = null;
		this.departure = null;
	}
	
	public Flight(String flight_number, Plane_type plane_type, Integer nb_place, String fromCity, String toCity, Date departure) {
		this.flight_number = flight_number;
		this.plane_type = plane_type;
		this.nb_place = nb_place;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.departure = departure;
	}

	public Integer getId() {
		return id;
	}

	public String getFlight_number() {
		return flight_number;
	}

	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}

	public Plane_type getPlane_type() {
		return plane_type;
	}

	public void setPlane_type(Plane_type plane_type) {
		this.plane_type = plane_type;
	}

	public Integer getNb_place() {
		return nb_place;
	}

	public void setNb_place(Integer nb_place) {
		this.nb_place = nb_place;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public Date getDeparture() {
		return departure;
	}

	public void setDeparture(Date departure) {
		this.departure = departure;
	}
	

}
