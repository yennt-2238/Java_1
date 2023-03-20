package studentmanagerment;

public class Subject {
	private String nameObject;
	private double scoreObject;
	
	public String getNameObject() {
		return nameObject;
	}

	public void setNameObject(String nameObject) {
		this.nameObject = nameObject;
	}

	public double getScoreObject() {
		return scoreObject;
	}

	public void setScoreObject(double scoreObject) {
		this.scoreObject = scoreObject;
	}

	public Subject(String nameObject, double scoreObject) {
		this.nameObject = nameObject;
		this.scoreObject = scoreObject;
	}
	

}
