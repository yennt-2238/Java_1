package Student_management;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student_infor student_1 = new student_infor("Yến 1", 23, "Đà Nẵng");
		student_infor student_2 = new student_infor("Yến 2", 24, "Đà Nẵng");
		student_infor student_3 = new student_infor("Yến 3", 25, "Quảng Nam");
		student_infor student_4 = new student_infor("Yến 4", 26, "Đà Nẵng");
		student_infor student_5 = new student_infor("Yến 5", 27, "Quảng Nam");
		student_infor student_6 = new student_infor("Yến 6", 28, "QĐà Nẵng");
		student_infor student_7 = new student_infor("Yến 7", 29, "Quảng Nam");
		student_infor student_8 = new student_infor("Yến 8", 30, "Đà Nẵng");
		student_infor student_9 = new student_infor("Yến 9", 31, "Quảng Nam");

		class_infor class_1 = new class_infor();
		class_1.add_new_student(student_1);
		class_1.add_new_student(student_2);
		class_1.add_new_student(student_3);
		class_1.add_new_student(student_4);
		class_1.add_new_student(student_5);
		class_1.add_new_student(student_6);
		class_1.add_new_student(student_7);
		class_1.add_new_student(student_8);
		class_1.add_new_student(student_9);
		
		class_1.displays_student();
		System.out.println("=============");
		class_1.checkCondition_student();
	}

}
