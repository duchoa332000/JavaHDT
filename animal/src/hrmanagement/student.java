package hrmanagement;

import java.util.Comparator;

public class student extends human {
	public static Comparator<student> comparestudent = new comparestudent();
	Integer grade;

	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student: FirstName= " + firstname + ", lastName= " + lastname +  ", grade= " + grade ;
	}
	
	public student(String firstname, String lastname, Integer grade) {
		super(firstname, lastname);
		this.grade = grade;
	}

	public student(String firstname, String lastname) {
		super(firstname, lastname);
		// TODO Auto-generated constructor stub
	}


	
}
