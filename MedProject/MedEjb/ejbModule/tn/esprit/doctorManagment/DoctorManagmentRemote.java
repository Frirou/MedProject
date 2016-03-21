package tn.esprit.doctorManagment;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.entities.Doctors;

@Remote

public interface DoctorManagmentRemote {
	
Boolean addDoctor (Doctors doctor);
Boolean upDateDoctor (Doctors doctor);
Boolean deleteDoctor (Doctors doctor);
Doctors findDoctorById( Integer id);
List<Doctors> findAllDoctors();

double calculNbFlying0();

double calculNbFlying1();
}
