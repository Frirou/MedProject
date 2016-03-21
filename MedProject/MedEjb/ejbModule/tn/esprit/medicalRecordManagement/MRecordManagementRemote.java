package tn.esprit.medicalRecordManagement;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.entities.MedicalRecord;

@Remote
public interface MRecordManagementRemote {
	Boolean addMrecord(MedicalRecord record);

	Boolean upDatMrecord(MedicalRecord record);

	Boolean deleteMrecord(MedicalRecord record);

	MedicalRecord findEscortById(Integer id);

	List<MedicalRecord> findAllRecord();
}
