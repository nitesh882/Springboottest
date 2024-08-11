package demo1.modal;


public class Student {
	public int id;
	public String name;
	public int age;
	public String classs;
	public String section;
	public String gender;
	public String dob;
	
	public Student() {
		//defalut constructer;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClasss() {
		return classs;
	}

	public void setClasss(String classs) {
		this.classs = classs;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Student(int id, String name, int age, String classs, String section, String gender, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.classs = classs;
		this.section = section;
		this.gender = gender;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", classs=" + classs + ", section=" + section
				+ ", gender=" + gender + ", dob=" + dob + "]";
	}
	
	
	
	  
	
}
