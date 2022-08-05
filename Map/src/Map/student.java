package Map;

import java.util.Objects;

public class student implements Cloneable {

	

	private int id;
	private String name;
	
	
	public student()
	{
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}


	public static void main(String[] args) {
		
		
		
		student st=new student();
		
		st.setId(8);
		st.setName("hehe");

		student st1=new student();
		st1.setId(8);
		st1.setName("hehe");
		
		
		System.out.println(st.hashCode());
		System.out.println(st1.hashCode());
		System.out.println(st.equals(st1));
		
		
	}
	
	
}
