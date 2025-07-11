package studentManagementSystem;

public class StudentInfo{
	String student_id;
	String student_name;
	int student_marks;
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getStudent_marks() {
		return student_marks;
	}
	public void setStudent_marks(int student_marks) {
		this.student_marks = student_marks;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_marks="
				+ student_marks + "]";
	}
	
}




