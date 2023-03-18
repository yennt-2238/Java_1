package studentmanagerment;

import java.time.LocalDate;

public class InServiceStudents extends Student {
	private String addressConect;

	public String getAddressConect() {
		return addressConect;
	}

	public void setAddressConect(String addressConect) {
		this.addressConect = addressConect;
	}

	public InServiceStudents(String idStudent, String fullName, LocalDate birthDate, String yearOfAdmission, float score,
			ResultLearning resultLearning, String addressConect) {
		super(idStudent, fullName, birthDate, yearOfAdmission, score, resultLearning);
		this.addressConect = addressConect;
	}

	public void checkInServiceStudents() {
		if (getAddressConect() != null) {
			System.out.println(" This is nServiceStudents");
			return;
		}
		System.out.println("This is student regular Student");
	}

}
