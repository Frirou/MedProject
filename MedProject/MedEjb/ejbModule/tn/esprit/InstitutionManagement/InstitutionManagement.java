package tn.esprit.InstitutionManagement;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.entities.Institution;

/**
 * Session Bean implementation class InstitutionManagement
 */
@Stateless
@LocalBean
public class InstitutionManagement implements InstitutionManagementRemote, InstitutionManagementLocal {
	@PersistenceContext 
    EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public InstitutionManagement() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addInstitution(Institution institution) {
		// TODO Auto-generated method stub
		try {
			entityManager.persist(institution);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean upDateInstitution(Institution institution) {
		// TODO Auto-generated method stub
		try {
			entityManager.merge(institution);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteInstitution(Institution institution) {
		// TODO Auto-generated method stub
		try {
			entityManager.remove(entityManager.merge(institution));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Institution findInstitutionrById(Integer id) {
		// TODO Auto-generated method stub
		Institution Institution=null;
		try {
			Institution=entityManager.find(Institution.class, id);
			
		} catch (Exception e) {
			
		}
		return Institution;
	}

	@Override
	public List<Institution> findAllInstitution() {
		// TODO Auto-generated method stub
		javax.persistence.Query query= entityManager.createQuery("select d from Institution d");
		return query.getResultList();
	}

}
