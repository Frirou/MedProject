package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Contributor
 *
 */
@Entity

public class Contributor implements Serializable {

	
    public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	private int id;
	private String firstName;
	private String lastName;
	private String adress;
	private int phoneNumber;
	private String email;
	private String image;
	private static final long serialVersionUID = 1L;

	public Contributor() {
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
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
   
}
