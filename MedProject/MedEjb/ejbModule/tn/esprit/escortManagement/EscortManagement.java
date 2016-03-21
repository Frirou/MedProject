package tn.esprit.escortManagement;

import java.util.List;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



import tn.esprit.entities.Escort;

/**
 * Session Bean implementation class EscortManagement
 */
@Stateless
public class EscortManagement implements EscortManagementRemote, EscortManagementLocal {
	@PersistenceContext
    EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public EscortManagement() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addEscort(Escort escort) {
		try {
			entityManager.persist(escort);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean upDateEscort(Escort escort) {
		try {
			entityManager.merge(escort);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteEscort(Escort escort) {
		try {
			entityManager.remove(entityManager.merge(escort));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Escort findEscortById(Integer id) {
		Escort escort=null;
		try {
			escort=entityManager.find(Escort.class, id);
			
		} catch (Exception e) {
			
		}
		return escort;
	}

	@Override
	public List<Escort> findAllEscorts() {
		
		return entityManager.createQuery("Select e from Escort e",
				Escort.class).getResultList();
		
	}
/*public Employee getEmployeeByCin (String cin)
	{
		return (Employee) em.createQuery("from Employee where cin ="+cin);
		
	}
	
	public List<Employee> getAllEmplyees ()
	{
		
		return em.createQuery("Select e from Employee e",
				Employee.class).getResultList();
	}*/
}

