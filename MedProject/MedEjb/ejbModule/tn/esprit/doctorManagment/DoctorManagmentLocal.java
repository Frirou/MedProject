package tn.esprit.doctorManagment;

import java.util.List;

import javax.ejb.Local;


import tn.esprit.entities.Doctors;

@Local
public interface DoctorManagmentLocal {
	Boolean addDoctor (Doctors doctor);
	Boolean upDateDoctor (Doctors doctor);
	Boolean deleteDoctor (Doctors doctor);
	Doctors findDoctorById( Integer id);
	List<Doctors> findAllDoctors();
	
	double calculNbFlying0();

	double calculNbFlying1();

	
}
