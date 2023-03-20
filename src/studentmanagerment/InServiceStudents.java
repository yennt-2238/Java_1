package studentmanagerment;

public class InServiceStudents extends Student {
	private String addressConect;

	public String getAddressConect() {
		return addressConect;
	}

	public void setAddressConect(String addressConect) {
		this.addressConect = addressConect;
	}

	public InServiceStudents(String idStudent, String fullName, String birthDate, String yearOfAdmission, float score,ResultLearning resultlearning,
			String addressConect) {
		super(idStudent, fullName, birthDate, yearOfAdmission, score,resultlearning);
		System.out.println("aabadsadas");
		this.addressConect = addressConect;
	}

	@Override
	public void displaysInfor() {
		super.displaysInfor();
		// System.out.format("%10.1f%n", getAddressConect());
		System.out.println(getAddressConect());
		System.out.println("======================================");
	}

}
