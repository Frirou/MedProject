package tn.esprit.medicalRecordManagement;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.entities.MedicalRecord;

@Local
public interface MRecordManagementLocal {
	Boolean addMrecord(MedicalRecord record);

	Boolean upDatMrecord(MedicalRecord record);

	Boolean deleteMrecord(MedicalRecord record);

	MedicalRecord findEscortById(Integer id);

	List<MedicalRecord> findAllRecord();
}
