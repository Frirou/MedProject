package tn.esprit.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.esprit.entities.Services;

/**
 * Entity implementation class for Entity: Institution
 *
 */
@Entity

public class Institution extends Services implements Serializable {

	
	private String type;
	private static final long serialVersionUID = 1L;

	public Institution() {
		super();
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
   
}
