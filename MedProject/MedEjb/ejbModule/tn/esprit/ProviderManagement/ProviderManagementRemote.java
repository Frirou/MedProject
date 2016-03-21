package tn.esprit.ProviderManagement;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.entities.Provider;

@Remote
public interface ProviderManagementRemote {
	Boolean addProvider (Provider provider);
	Boolean upDateProvider (Provider provider);
	Boolean deleteProvider (Provider provider);
	Provider findProviderById( Integer id);
	List<Provider> findAllProvider();

}
