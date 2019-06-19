package feeney.hibernateTest;

import java.util.*;

public class RunHibernateExample {

	public static void main(String[] args) {
		
		TestDAO t = TestDAO.getInstance();
		
		List<Student> s = t.getStudents();
		for (Student i : s) {
			System.out.println(i);
		}
		
		System.out.println(t.getStudent(2));

	}

}
