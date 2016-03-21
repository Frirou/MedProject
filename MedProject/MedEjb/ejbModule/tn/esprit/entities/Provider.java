package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.esprit.entities.Services;

/**
 * Entity implementation class for Entity: Provider
 *
 */
@Entity

public class Provider extends Services implements Serializable {

	
	private String speciality;
	private boolean flyingA;
	private static final long serialVersionUID = 1L;

	public Provider() {
		super();
	}   
	public String getSpeciality() {
		return this.speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}   
	public boolean getFlyingA() {
		return this.flyingA;
	}

	public void setFlyingA(boolean flyingA) {
		this.flyingA = flyingA;
	}
   
}
