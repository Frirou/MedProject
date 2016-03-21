package tn.esprit.MapsTestManagement;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.entities.MapsTest;

/**
 * Session Bean implementation class MapsManagement
 */
@Stateless
@LocalBean
public class MapsManagement implements MapsManagementRemote, MapsManagementLocal {
	@PersistenceContext 
    EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public MapsManagement() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addMaps(MapsTest maps) {
		// TODO Auto-generated method stub
		try {
			entityManager.persist(maps);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
