package studentmanagerment;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String nameDepartment;
	List<Student> studentList = new ArrayList<>();

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public Department(String nameDepartment, List<Student> studentList) {
		this.nameDepartment = nameDepartment;
		this.studentList = studentList;
	}

}
