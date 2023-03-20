package studentmanagerment;

public class RegularStudents extends Student {

	
	public RegularStudents() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegularStudents(String idStudent, String fullName, String birthDate, String yearOfAdmission, float score,
			ResultLearning resultlearning) {
		super(idStudent, fullName, birthDate, yearOfAdmission, score, resultlearning);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displaysInfor() {
		super.displaysInfor();
		System.out.println("======================================");
	}

}