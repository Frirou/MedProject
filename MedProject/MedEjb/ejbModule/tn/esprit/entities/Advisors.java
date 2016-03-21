package tn.esprit.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Advisors
 *
 */
@Entity

public class Advisors extends Contributor implements Serializable {

	private String diplomaType;
	private static final long serialVersionUID = 1L;

	public Advisors() {
		super();
	}

	public String getDiplomaType() {
		return diplomaType;
	}

	public void setDiplomaType(String diplomaType) {
		this.diplomaType = diplomaType;
	}


	
   
}
