package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Packages
 *
 */
@Entity

public class Packages implements Serializable {

	private int id;
	private String description;
	private String treatment;
	private float cost;
	private String image;
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	private static final long serialVersionUID = 1L;

	public Packages() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)   
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	   
	
	   
   
}
