package tn.esprit.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Doctors
 *
 */
@Entity

public class Doctors extends Contributor implements Serializable {

	private boolean flyingDoctor;
	private String speciality;
	
	private static final long serialVersionUID = 1L;

	public Doctors() {
		super();
	}

	public boolean isFlyingDoctor() {
		return flyingDoctor;
	}

	public void setFlyingDoctor(boolean flyingDoctor) {
		this.flyingDoctor = flyingDoctor;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
   
}
