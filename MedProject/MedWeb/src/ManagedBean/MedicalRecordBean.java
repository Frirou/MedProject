package ManagedBean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import tn.esprit.entities.MedicalRecord;
import tn.esprit.medicalRecordManagement.MRecordManagementLocal;

@ManagedBean
@ViewScoped
public class MedicalRecordBean {

	@EJB
	private MRecordManagementLocal recordlocal;

	private MedicalRecord record = new MedicalRecord();
	private List<MedicalRecord> records;
	private List<MedicalRecord> filetredRecords;
	private boolean formDisplayed = false;

	public MedicalRecordBean() {

	}

	@PostConstruct
	public void init() {

		records = recordlocal.findAllRecord();

	}

	public void doSaveOrUpdate() {

		recordlocal.addMrecord(record);
		records = recordlocal.findAllRecord();
		formDisplayed = false;

	}

	public List<MedicalRecord> getRecordsbyId(int id) {

		records = (List<MedicalRecord>) recordlocal.findEscortById(id);
		return records;
	}

	public void addMessage(FacesMessage message) {
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public void doNew() {

		record = new MedicalRecord();
		formDisplayed = true;

	}

	public String doUpdate() {

		recordlocal.upDatMrecord(record);
		init();
		return null;

	}

	public void onRowSelect(SelectEvent event) {
		formDisplayed = true;

	}

	public void doDelete() {

		recordlocal.deleteMrecord(record);
		records = recordlocal.findAllRecord();
		formDisplayed = false;

	}

	public void doCancel() {

		record = new MedicalRecord();
		records = recordlocal.findAllRecord();
		formDisplayed = false;

	}

	public boolean isFormDisplayed() {
		return formDisplayed;
	}

	public void setFormDisplayed(boolean formDisplayed) {
		this.formDisplayed = formDisplayed;
	}

	public MedicalRecord getRecord() {
		return record;
	}

	public void setRecord(MedicalRecord record) {
		this.record = record;
	}

	public List<MedicalRecord> getRecords() {
		return records;
	}

	public void setRecords(List<MedicalRecord> records) {
		this.records = records;
	}

	public List<MedicalRecord> getFiletredRecords() {
		return filetredRecords;
	}

	public void setFiletredRecords(List<MedicalRecord> filetredRecords) {
		this.filetredRecords = filetredRecords;
	}

}
