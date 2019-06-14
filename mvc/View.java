package mvc;


public class View {
	
	public void outputStudent(String name, String id, String birth, String year, String major){
		System.out.println("Student name:  " + name);
		System.out.println("Student id:  " + id);
		System.out.println("Student birth:  " + birth);
		System.out.println("Student year:  " + year);
		System.out.println("Student major:  " + major);
	}
}