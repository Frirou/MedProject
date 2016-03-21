package tn.esprit.MapsTestManagement;

import javax.ejb.Remote;

import tn.esprit.entities.MapsTest;

@Remote
public interface MapsManagementRemote {
	Boolean addMaps(MapsTest maps);

}
