package tn.esprit.MapsTestManagement;

import javax.ejb.Local;


import tn.esprit.entities.MapsTest;

@Local
public interface MapsManagementLocal {
	Boolean addMaps(MapsTest maps);

}
