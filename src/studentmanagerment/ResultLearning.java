package studentmanagerment;

public class ResultLearning {
	private String semester;
	private String subject1;
	private String subject2;
	private String subject3;
	private String subject4;
	private String subject5;
	private float scoreSubject1;
	private float scoreSubject2;
	private float scoreSubject3;
	private float scoreSubject4;
	private float scoreSubject5;

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getSubject1() {
		return subject1;
	}

	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}

	public String getSubject2() {
		return subject2;
	}

	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}

	public String getSubject3() {
		return subject3;
	}

	public void setSubject3(String subject3) {
		this.subject3 = subject3;
	}

	public String getSubject4() {
		return subject4;
	}

	public void setSubject4(String subject4) {
		this.subject4 = subject4;
	}

	public String getSubject5() {
		return subject5;
	}

	public void setSubject5(String subject5) {
		this.subject5 = subject5;
	}

	public float getScoreSubject1() {
		return scoreSubject1;
	}

	public void setScoreSubject1(float scoreSubject1) {
		this.scoreSubject1 = scoreSubject1;
	}

	public float getScoreSubject2() {
		return scoreSubject2;
	}

	public void setScoreSubject2(float scoreSubject2) {
		this.scoreSubject2 = scoreSubject2;
	}

	public float getScoreSubject3() {
		return scoreSubject3;
	}

	public void setScoreSubject3(float scoreSubject3) {
		this.scoreSubject3 = scoreSubject3;
	}

	public float getScoreSubject4() {
		return scoreSubject4;
	}

	public void setScoreSubject4(float scoreSubject4) {
		this.scoreSubject4 = scoreSubject4;
	}

	public float getScoreSubject5() {
		return scoreSubject5;
	}

	public void setScoreSubject5(float scoreSubject5) {
		this.scoreSubject5 = scoreSubject5;
	}

	public ResultLearning(String semester, String subject1, String subject2, String subject3, String subject4,
			String subject5, float scoreSubject1, float scoreSubject2, float scoreSubject3, float scoreSubject4,
			float scoreSubject5) {
		super();
		this.semester = semester;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
		this.subject5 = subject5;
		this.scoreSubject1 = scoreSubject1;
		this.scoreSubject2 = scoreSubject2;
		this.scoreSubject3 = scoreSubject3;
		this.scoreSubject4 = scoreSubject4;
		this.scoreSubject5 = scoreSubject5;
	}

	public double getResult() {
		return ((getScoreSubject1() + getScoreSubject2() + getScoreSubject3() + getScoreSubject4() + getScoreSubject5())
				/ 5);
	}
}
