package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity
@DiscriminatorValue(value="admin")
public class Admin implements Serializable {

	private int id;
	private String login;
	private String pwd;
	private static final long serialVersionUID = 1L;

	public Admin() {
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
