package studentmanagerment;

public class RegularStudents extends Student {

	public RegularStudents(String idStudent, String fullName, String birthDate, String yearOfAdmission, float score) {
		super(idStudent, fullName, birthDate, yearOfAdmission, score);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void displaysInfor() {
		super.displaysInfor();
		System.out.println("======================================");
	}

}