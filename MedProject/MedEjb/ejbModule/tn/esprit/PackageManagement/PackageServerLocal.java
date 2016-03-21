package tn.esprit.PackageManagement;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.entities.News;
import tn.esprit.entities.Packages;

@Local
public interface PackageServerLocal {
	boolean addPackage(Packages c);
	boolean updatPackage(Packages a);
	 boolean deletePackage(Packages a);
	 Packages findPackageById(Integer id);
	public List<Packages> findAllPackage();
}
