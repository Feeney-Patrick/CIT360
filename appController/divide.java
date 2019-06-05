package appController;

public class divide implements mathProblem{
	public void execute(Integer number1, Integer number2){
		Integer division = number1 / number2;
		System.out.println(division);
	}
	
	public int division(int number1, int number2) {
		return number1 / number2;
	}
}
