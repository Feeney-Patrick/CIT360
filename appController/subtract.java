package appController;

public class subtract implements mathProblem {
	public void execute(Integer number1, Integer number2){
		Integer subtraction = number1 - number2;
		System.out.println(subtraction);
	}
	public int subtraction(int number1, int number2) {
		return number1 - number2;
	}
}