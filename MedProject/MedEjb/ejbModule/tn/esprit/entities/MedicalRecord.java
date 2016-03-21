package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class MedicalRecord implements Serializable{

	private int id;
	private String etatMedical;
	private String allergie;
	private String sang;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEtatMedical() {
		return etatMedical;
	}
	public void setEtatMedical(String etatMedical) {
		this.etatMedical = etatMedical;
	}
	public String getAllergie() {
		return allergie;
	}
	public void setAllergie(String allergie) {
		this.allergie = allergie;
	}
	public String getSang() {
		return sang;
	}
	public void setSang(String sang) {
		this.sang = sang;
	}

	
}
