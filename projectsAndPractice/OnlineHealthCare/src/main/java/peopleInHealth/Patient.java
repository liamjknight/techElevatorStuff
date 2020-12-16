package peopleInHealth;

public class Patient extends Person {
	
	private String diagnosis;
	private String treatment;
	private char[] dateOfVisit;
	

	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	public char[] getDateOfVisit() {
		return dateOfVisit;
	}
	public void setDateOfVisit(char[] dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}


	public Patient(String firstName, String lastName, String hospitalID) {
		super(firstName, lastName, hospitalID);
	}
}
