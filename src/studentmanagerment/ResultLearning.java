package studentmanagerment;

import java.util.ArrayList;
import java.util.List;

public class ResultLearning {
	private String semester;
	List<Subject> subjects = new ArrayList<>();
	
	public ResultLearning(String semester, List<Subject> subjects) {
		this.semester = semester;
		this.subjects = subjects;
	}
	

}