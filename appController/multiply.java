package appController;

public class multiply implements mathProblem {
	public void execute(Integer number1, Integer number2){
		Integer multipication = number1 * number2;
		System.out.println(multipication);
	}
	
	public int multiplication(int number1, int number2) {
		return number1 * number2;
	}
}