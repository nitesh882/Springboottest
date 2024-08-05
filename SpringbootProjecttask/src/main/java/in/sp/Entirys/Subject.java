package in.sp.Entirys;


import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;

@Entity
public class Subject {
    @Id
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "subjects")
    private Set<Student> students = new HashSet<>();
    
    
    
    public Subject(Long id, String name, Set<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", students=" + students + "]";
	}

	
    
}
