package studentmanagerment;

public class Student {
	private String idStudent;
	private String fullName;
	private String birthDate;
	private String yearOfAdmission;
	private float score;
	private ResultLearning resultLearning;

	public String getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(String idStudent) {
		this.idStudent = idStudent;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getYearOfAdmission() {
		return yearOfAdmission;
	}

	public void setYearOfAdmission(String yearOfAdmission) {
		this.yearOfAdmission = yearOfAdmission;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public ResultLearning getResultLearning() {
		return resultLearning;
	}

	public Student(String idStudent, String fullName, String birthDate, String yearOfAdmission, float score,
			ResultLearning resultlearning) {
		this.idStudent = idStudent;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.yearOfAdmission = yearOfAdmission;
		this.score = score;
		this.resultLearning = resultlearning;
		
	}

	public void setResultLearning(ResultLearning resultLearning) {
		this.resultLearning = resultLearning;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public void displaysInfor() {
		System.out.println("ID: " + getIdStudent());
		System.out.println("Full Name: " + getFullName());
		System.out.println("Birthdate: " + getBirthDate());
		System.out.println("Year of Ad: " + getYearOfAdmission());
		System.out.println("Score: " + getScore());

	}

	public double calculateAVG() {
		double total = 0;
		for (Subject sub : this.resultLearning.subjects) {
			total += sub.getScoreObject();
		}
		return Math.round((total)) / this.resultLearning.subjects.size();

	}

}
