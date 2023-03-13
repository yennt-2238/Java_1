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

	public InServiceStudents(int idStudent, String fullName, LocalDate birthDate, LocalDate yearOfAdmission,
			float score, ResultLearning resultLearning, String addressConect) {
		super(idStudent, fullName, birthDate, yearOfAdmission, score, resultLearning);
		this.addressConect = addressConect;
	}

}
