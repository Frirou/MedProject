package tn.esprit.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Escort
 *
 */
@Entity

public class Escort extends Contributor implements Serializable {

	private boolean diponibility;
	
	private static final long serialVersionUID = 1L;

	public Escort() {
		super();
	}

	public boolean isDiponibility() {
		return diponibility;
	}

	public void setDiponibility(boolean diponibility) {
		this.diponibility = diponibility;
	}
	
   
}
