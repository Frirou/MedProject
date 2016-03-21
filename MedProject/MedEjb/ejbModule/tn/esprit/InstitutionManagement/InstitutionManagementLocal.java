package tn.esprit.InstitutionManagement;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.entities.Institution;

@Local
public interface InstitutionManagementLocal {
	Boolean addInstitution (Institution institution);
	Boolean upDateInstitution (Institution institution);
	Boolean deleteInstitution (Institution institution);
	Institution findInstitutionrById( Integer id);
	List<Institution> findAllInstitution();

}
