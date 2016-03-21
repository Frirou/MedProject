package tn.esprit.ProviderManagement;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.entities.Provider;

@Local
public interface ProviderManagementLocal {
	Boolean addProvider (Provider provider);
	Boolean upDateProvider (Provider provider);
	Boolean deleteProvider (Provider provider);
	Provider findProviderById( Integer id);
	List<Provider> findAllProvider();

}
