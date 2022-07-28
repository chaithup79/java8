package entity;


public class employee {

	
	private int id;
	private String employeeName;
	private int age;
	private String gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public employee(int id, String employeeName, int age, String gender) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.age = age;
		this.gender = gender;
	}
	public employee() {

	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", employeeName=" + employeeName + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
