package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Services
 *
 */
@Entity

public class Services implements Serializable {

	private int id;
	private String adress;
	private int phoneNumber;
	private String email;
	private String login;
	private String pwd;
	private static final long serialVersionUID = 1L;

	public Services() {
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
   
}
