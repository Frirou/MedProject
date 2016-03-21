package tn.esprit.PackageManagement;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.entities.Packages;

/**
 * Session Bean implementation class PackageServer
 */
@Stateless
public class PackageServer implements PackageServerRemote {
	@PersistenceContext
    EntityManager em;
	
    /**
     * Default constructor. 
     */
    public PackageServer() {	
    }
    
    public boolean addPackage(Packages c) {
		try {
			em.persist(c);
			return true;
		
		} catch (Exception e) {
		return false;
		}	
			}
    
    public boolean updatPackage(Packages a) {
		try {
    		em.merge(a);
    		return true;
    	
    	} catch (Exception e) {
    	return false;
    	}}
    public boolean deletePackage(Packages a) {
		try {
    		em.remove(em.merge(a));
    		return true;
    	
    	} catch (Exception e) {
    	return false;
    	}}
    
    public Packages findPackageById(Integer id) {
		Packages packages=null;
		try {
			packages=em.find(Packages.class, id);
    	
    	} catch (Exception e) {
    	}return packages ;}
    
   
    public List<Packages> findAllPackage() {
		Query query= em.createNativeQuery("SELECT * FROM medicaltourismds.packages");
		return query.getResultList();
	}
}
