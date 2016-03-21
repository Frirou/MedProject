package tn.esprit.advisorManagment;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.entities.Advisors;

@Local
public interface AdvisorManagmentLocal {
	Boolean addAdvisor(Advisors advisor);
	Boolean upDateAdvisor (Advisors advisor);
	Boolean deleteAdvisor (Advisors advisor);
	Advisors findAdvisorById( Integer id);
	List<Advisors> findAllAdvisors();
}
