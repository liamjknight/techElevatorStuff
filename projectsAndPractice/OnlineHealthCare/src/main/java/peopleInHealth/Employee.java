package peopleInHealth;

public class Employee extends Person {
	
	private int department;
	private boolean workingToday;
	private int salary;

	public int getSalary() {
		return salary;
	}
	public int getDepartment() {
		return department;
	}
	public boolean isWorking() {
		return workingToday;
	}


	public Employee(String firstName, String lastName, String hospitalID, int department) {
		super(firstName, lastName, hospitalID);
		this.department=department;
	}


	public void changeDepartment(int newDepartment) {
		this.department=newDepartment;
	}
	public void clockIn_Out() {
		this.workingToday = !workingToday;
	}
}
