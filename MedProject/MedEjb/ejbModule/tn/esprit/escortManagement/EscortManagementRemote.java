package tn.esprit.escortManagement;



import javax.ejb.Remote;
import java.util.List;




import tn.esprit.entities.Escort;

@Remote
public interface EscortManagementRemote {
	Boolean addEscort (Escort escort);
	Boolean upDateEscort (Escort escort);
	Boolean deleteEscort (Escort escort);
	Escort findEscortById( Integer id);
	List<Escort> findAllEscorts();
	
	
}
