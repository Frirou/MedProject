package tn.esprit.advisorManagment;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.entities.Advisors;
import tn.esprit.entities.Doctors;

/**
 * Session Bean implementation class AdvisorManagment
 */
@Stateless
public class AdvisorManagment implements AdvisorManagmentRemote, AdvisorManagmentLocal {

	@PersistenceContext 
    EntityManager entityManager;
    
    public AdvisorManagment() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addAdvisor(Advisors advisor) {
		try {
			entityManager.persist(advisor);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean upDateAdvisor(Advisors advisor) {
		try {
			entityManager.merge(advisor);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteAdvisor(Advisors advisor) {
		try {
			entityManager.remove(entityManager.merge(advisor));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Advisors findAdvisorById(Integer id) {
		Advisors advisor=null;
		try {
			advisor=entityManager.find(Advisors.class, id);
			
		} catch (Exception e) {
			
		}
		return advisor;
	}

	@Override
	public List<Advisors> findAllAdvisors() {
		javax.persistence.Query query= entityManager.createQuery("select d from Advisors d");
		return query.getResultList();
	}

}
