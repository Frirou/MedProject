package tn.esprit.medicalRecordManagement;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.entities.MedicalRecord;

/**
 * Session Bean implementation class MRecordManagement
 */
@Stateless
public class MRecordManagement implements MRecordManagementRemote,
		MRecordManagementLocal {
	@PersistenceContext
	EntityManager entityManager;

	public MRecordManagement() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addMrecord(MedicalRecord record) {
		try {
			entityManager.persist(record);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean upDatMrecord(MedicalRecord record) {
		try {
			entityManager.merge(record);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteMrecord(MedicalRecord record) {
		try {
			entityManager.remove(entityManager.merge(record));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public MedicalRecord findEscortById(Integer id) {
		MedicalRecord record = null;
		try {
			record = entityManager.find(MedicalRecord.class, id);

		} catch (Exception e) {

		}
		return record;
	}

	@Override
	public List<MedicalRecord> findAllRecord() {
		return entityManager.createQuery("Select e from MedicalRecord e",
				MedicalRecord.class).getResultList();
	}

}
