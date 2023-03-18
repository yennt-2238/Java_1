package studentmanagerment;

import java.time.LocalDate;

//Xây dựng chương trình quản lý kết quả học tập của sinh viên tại một trường đại học. 
//Có 2 loại sinh viên là sinh viên chính quy và sinh viên tại chức 
//với các thông tin giống nhau: mã sinh viên, họ tên, ngày tháng năm sinh, năm vào học, điểm đầu vào và
//danh sách kết quả học tập. Sinh viên tại chức có thêm thông tin nơi liên kết đào tạo (Đồng Nai, Cà Mau, …)
//. Khoa gồm có các thông tin: tên khoa và danh sách sinh viên đang theo học. 
//Kết quả học tập gồm có tên học kỳ, điểm trung bình học kỳ đó.

public class Student {
	private String idStudent;
	private String fullName;
	private LocalDate birthDate;
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

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
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

	public Student(String idStudent, String fullName, LocalDate birthDate, String yearOfAdmission, float score,
			ResultLearning resultLearning) {
		this.idStudent = idStudent;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.yearOfAdmission = yearOfAdmission;
		this.score = score;
		this.resultLearning = resultLearning;
	}

	public void setResultLearning(ResultLearning resultLearning) {
		this.resultLearning = resultLearning;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public void displaysInfor() {
		System.out.println("Infor Student");
		System.out.println("ID: "+getIdStudent());
		System.out.println("Full Name: "+getFullName());
		System.out.println("Birthdate: "+getBirthDate());
		System.out.println("Year of Ad"+getYearOfAdmission());
		System.out.println("Score: "+getScore());
		

		
	}
	

}
