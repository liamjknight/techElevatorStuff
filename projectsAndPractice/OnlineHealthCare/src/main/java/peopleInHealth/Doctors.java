package peopleInHealth;

public class Doctors extends Employee {
	
	private boolean inER = false;
	
	
	public boolean isInER() {
		return inER;
	}
	public void setInER() {
		this.inER = !inER;
	}
	
	
	public Doctors(String firstName, String lastName, String hospitalID, int department) {
		super(firstName, lastName, hospitalID, department);
	}
}
