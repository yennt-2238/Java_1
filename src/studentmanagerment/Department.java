package studentmanagerment;

import java.util.ArrayList;
import java.util.List;

import vehicle_manager.Car;
import vehicle_manager.bike;

public class Department {
	private String nameDepartment;
	List<Student> studentList = new ArrayList<>();

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void displaysInforDepartment() {
		System.out.println(getNameDepartment());
		for (Student i : studentList) {
			i.displaysInfor();
		}

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

//	public Department() {
//	}

	public void addRegularStudent(RegularStudents student1) {
		studentList.add(student1);
	}

	public void addInserviceStudent(InServiceStudents student2) {
		studentList.add(student2);

	}


	public void checkRegularStudents(Student j) {
		if (j.getIdStudent().startsWith("R")) {
			System.out.println("==============================");
			System.out.println("This is regular ");
			j.displaysInfor();
			return;
		}
		System.out.println("==============================");
		System.out.println(" Day khoong phai hoc sinh chinh quy");

	}

	public void countRegularStudent() {
		int count = 0;
		for (Student i : studentList) {
			if (i.getIdStudent().startsWith("R")) {
				count += 1;
			}
		}
		System.out.println("Số học sinh chính quy trong khoa là: " + count);

	}

	public void maxCore() {
		Student max = new Student();
		for (Student j : studentList) {
			if (j.getScore() > max.getScore()) {
				max = j;
			}

		}
		System.out.println("Hoc sinh co diem cao nhat la: ");
		max.displaysInfor();
	}

}
