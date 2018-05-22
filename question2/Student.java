package tpgproject.question2;

public class Student {
	
	private String name;
	private Integer id;
	private Double gpa;
	
	public Student(String name, Integer id, Double gpa) {
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getGpa() {
		return gpa;
	}
	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
}
