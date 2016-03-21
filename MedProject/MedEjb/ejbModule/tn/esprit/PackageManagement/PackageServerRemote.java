package tn.esprit.PackageManagement;
import java.util.List;

import javax.ejb.Remote;

import tn.esprit.entities.Packages;

@Remote
public interface PackageServerRemote {
	
	boolean addPackage(Packages c);
	boolean updatPackage(Packages a);
	 boolean deletePackage(Packages a);
	 Packages findPackageById(Integer id);
	public List<Packages> findAllPackage();
} 
