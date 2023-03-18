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

	public void countRegularStudent() {
		int count = 0;
		for (Student i : studentList) {
			if (i.getIdStudent().startsWith("R")) {
				count += 1;
			}
			System.out.println("Số học sinh chính quy trong khoa là: " + count);
		}
	}

	public void maxCore() {
		Student max = new Student();
		for (Student j : studentList) {
			if (j.getScore() > max.getScore()) {
				max = j;
			}
			System.out.println("Diểm cao nhất là: " + max.getFullName() + max.getScore());

		}

	}

}
