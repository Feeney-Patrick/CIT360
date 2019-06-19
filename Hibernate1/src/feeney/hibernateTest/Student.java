package feeney.hibernateTest;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "studentId")
	private int studentId;
	
	@Column(name = "studentFirstName")
	private String studentFirstName;
	
	@Column(name = "studentLastName")
	private String studentLastName;
	
	@Column(name = "studentMajor")
	private String studentMajor;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentMajor() {
		return studentMajor;
	}

	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}
	
	public String toString() {
		return Integer.toString(studentId) + " " + studentFirstName + " " + studentLastName + " " + studentMajor;
	}
	
}
