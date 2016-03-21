package tn.esprit.advisorManagment;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.entities.Advisors;

@Remote
public interface AdvisorManagmentRemote {
	Boolean addAdvisor(Advisors advisor);
	Boolean upDateAdvisor (Advisors advisor);
	Boolean deleteAdvisor (Advisors advisor);
	Advisors findAdvisorById( Integer id);
	List<Advisors> findAllAdvisors();
}
