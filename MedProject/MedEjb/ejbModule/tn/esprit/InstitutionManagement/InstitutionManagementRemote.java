package tn.esprit.InstitutionManagement;



import javax.ejb.Remote;

import tn.esprit.entities.Institution;
import java.util.List;

@Remote
public interface InstitutionManagementRemote {
	Boolean addInstitution (Institution institution);
	Boolean upDateInstitution (Institution institution);
	Boolean deleteInstitution (Institution institution);
	Institution findInstitutionrById( Integer id);
	List<Institution> findAllInstitution();

}
