package tn.esprit.escortManagement;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.entities.Escort;

@Local
public interface EscortManagementLocal {

	Boolean addEscort (Escort escort);
	Boolean upDateEscort (Escort escort);
	Boolean deleteEscort (Escort escort);
	Escort findEscortById( Integer id);
	List<Escort> findAllEscorts();
	
}
