package tn.esprit.doctorManagment;
import java.util.List;

import tn.esprit.entities.Doctors;

import javax.ejb.Stateless;
import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class DoctorManagment
 */
@Stateless
public class DoctorManagment implements DoctorManagmentRemote, DoctorManagmentLocal {
@PersistenceContext 
    EntityManager entityManager;
    
    public DoctorManagment() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addDoctor(Doctors doctor) {
		try {
			entityManager.persist(doctor);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Boolean upDateDoctor(Doctors doctor) {
		try {
			entityManager.merge(doctor);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteDoctor(Doctors doctor) {
		try {
			entityManager.remove(entityManager.merge(doctor));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Doctors findDoctorById(Integer id) {
		Doctors doctor=null;
		try {
			doctor=entityManager.find(Doctors.class, id);
			
		} catch (Exception e) {
			
		}
		return doctor;
	}

	@Override
	public List<Doctors> findAllDoctors() {
		javax.persistence.Query query= entityManager.createQuery("select d from Doctors d");
		return query.getResultList();
	}

	@Override
	public double calculNbFlying0() {
		// TODO Auto-generated method stub
	javax.persistence.Query query= entityManager.createQuery("select count(*) as Logistics from Doctors where flyingDoctor=0")	;
	
		Long result0 =(Long)query.getSingleResult();
		double res = result0.doubleValue();

		return res;

	}

	@Override
	public double calculNbFlying1() {
		// TODO Auto-generated method stub
		javax.persistence.Query query= entityManager.createQuery("select count(*) as Oui from Doctors where flyingDoctor=1")	;
		
		Long result0 =(Long)query.getSingleResult();
		double res = result0.doubleValue();

		return res;
	}

}
