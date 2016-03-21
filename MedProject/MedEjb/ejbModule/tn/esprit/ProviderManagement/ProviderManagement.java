package tn.esprit.ProviderManagement;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.entities.Provider;

/**
 * Session Bean implementation class ProviderManagement
 */
@Stateless
@LocalBean
public class ProviderManagement implements ProviderManagementRemote, ProviderManagementLocal {
	@PersistenceContext
    EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public ProviderManagement() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addProvider(Provider provider) {
		// TODO Auto-generated method stub
		try {
			entityManager.persist(provider);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean upDateProvider(Provider provider) {
		// TODO Auto-generated method stub
		try {
			entityManager.merge(provider);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteProvider(Provider provider) {
		// TODO Auto-generated method stub
		try {
			entityManager.remove(entityManager.merge(provider));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Provider findProviderById(Integer id) {
		// TODO Auto-generated method stub
		Provider doctor=null;
		try {
			doctor=entityManager.find(Provider.class, id);
			
		} catch (Exception e) {
			
		}
		return doctor;
	}

	@Override
	public List<Provider> findAllProvider() {
		// TODO Auto-generated method stub
		javax.persistence.Query query= entityManager.createQuery("select d from Provider d");
		return query.getResultList();
	}

}
