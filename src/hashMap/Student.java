package hashMap;

public class Student {
	
	static String collegeName = "Madha Engineering College";
	private String name;
	private int id;
	private String deperment;
	private int percentage;
	public Student(String name, int id, String deperment, int percentage) {
		super();
		this.name = name;
		this.id = id;
		this.deperment = deperment;
		this.percentage = percentage;
	}
	public static String getCollegeName() {
		return collegeName;
	}
	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeperment() {
		return deperment;
	}
	public void setDeperment(String deperment) {
		this.deperment = deperment;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	@Override
	public String toString() {
		return "Students [name=" + name + ", id=" + id + ", deperment=" + deperment + ", percentage=" + percentage
				+ "]";
	}
	
	

}
