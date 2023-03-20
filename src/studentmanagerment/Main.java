package studentmanagerment;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InServiceStudents st1 = new InServiceStudents("I_20230318", " Nguyễn Thị Yến C 1", "1995-02-01", "2018", 24,
				"Cà Mau");
		InServiceStudents st2 = new InServiceStudents("I_20230319", " Nguyễn Thị Yến C 2", "1995-02-02", "2018", 24,
				"Cà Mau");
		InServiceStudents st3 = new InServiceStudents("I_20230320", " Nguyễn Thị Yến C 3", "1995-02-03", "2018", 30,
				"Đồng Nai");
		InServiceStudents st4 = new InServiceStudents("I_20230321", " Nguyễn Thị Yến C 4", "1995-02-04", "2019", 28,
				"Đà Nẵng");
		InServiceStudents st5 = new InServiceStudents("I_20230322", " Nguyễn Thị Yến C 5", "1995-02-05", "2020", 24,
				"Cà Mau");

		RegularStudents st6 = new RegularStudents("R_20230323", "Nguyễn Thị Yến C  6", "1995-10-10", "2020", 32);
		RegularStudents st7 = new RegularStudents("R_20230324", "Nguyễn Thị Yến C  7", "1995-10-10", "2021", 28);
		RegularStudents st8 = new RegularStudents("R_20230325", "Nguyễn Thị Yến C  8", "1995-10-10", "2023", 35);
		RegularStudents st9 = new RegularStudents("R_20230326", "Nguyễn Thị Yến C  9", "1995-10-10", "2022", 40);
		List<Student> studentList = new ArrayList<>();
		Department dp1 = new Department("Department_1", studentList);
		dp1.addInserviceStudent(st1);
		dp1.addInserviceStudent(st2);
		dp1.addInserviceStudent(st3);
		dp1.addInserviceStudent(st4);
		dp1.addInserviceStudent(st5);
		dp1.addRegularStudent(st6);
		dp1.addRegularStudent(st7);
		dp1.addRegularStudent(st8);
		dp1.addRegularStudent(st9);
		dp1.displaysInforDepartment();

		dp1.countRegularStudent();

		dp1.checkRegularStudents(st9);

		dp1.maxCore();

	}

}
