package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BestPokeStay implements Serializable{

	private int id;
	private String hotel;
	private String clinique;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public String getClinique() {
		return clinique;
	}
	public void setClinique(String clinique) {
		this.clinique = clinique;
	}
	
	
	
	
}
