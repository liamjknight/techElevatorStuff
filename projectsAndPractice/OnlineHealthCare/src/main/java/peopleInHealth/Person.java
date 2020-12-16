package peopleInHealth;

abstract class Person {
	private String firstName;
	private String lastName;
	private String hospitalID;
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getHospitalID() {
		return hospitalID;
	}

	public Person(String firstName, String lastName, String hospitalID) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.hospitalID=hospitalID;
	}
}
