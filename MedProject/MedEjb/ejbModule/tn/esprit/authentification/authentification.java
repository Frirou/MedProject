package tn.esprit.authentification;

import javax.ejb.Stateless;
import javax.persistence.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.omg.CORBA.PUBLIC_MEMBER;

import tn.esprit.entities.Admin;

/**
 * Session Bean implementation class authentification
 */
@Stateless
public class authentification implements authentificationRemote, authentificationLocal {
	@PersistenceContext
    EntityManager entityManager;
    public authentification() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Admin authentificate(String login, String pwd) {
		Admin admin=null;
		Query query =entityManager.createQuery("select e from Admin e where e.login=:l and e.pwd=:p ");
		//javax.persistence.Query query=entityManager.createQuery("select e from Admin e where e.login=:l and e.pwd=:p ");
		
	    query.setParameter("l",login).setParameter("p",pwd);
		
		try {
		admin = (Admin)query.getSingleResult();
		} catch (Exception e) {
			admin=null;
		}
		
		return admin;
	}

}
