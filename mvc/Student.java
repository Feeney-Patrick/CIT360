package mvc;

public class Student {
	public static void main(String[] args) {
		View view = new View();
		Model model = getStudent();
		Controller controller = new Controller(model, view);
	
		controller.updateView();
		
	}
	private static Model getStudent() {
			Model student = new Model();
			student.setName("Saywer Smith");
			student.setId("8859384939");
			student.setBirth("06/30/1999");
			student.setYear("Sophomore");
			student.setMajor("Geology");
			return student;
		}
}
