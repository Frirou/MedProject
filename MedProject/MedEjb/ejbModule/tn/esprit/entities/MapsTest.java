package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class MapsTest implements Serializable {
	
	private float longitude;
	private float latitude;
	private int id;
	private static final long serialVersionUID = 1L;
	
	public MapsTest(){
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
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	
	
}
