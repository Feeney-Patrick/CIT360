package appController;

import java.util.HashMap;

public class Controller {
	public static HashMap<String, mathProblem> key = new HashMap <String, mathProblem>();
	 
	public void Controller(){
		
	}
	
	public static void functionMaker(String operator, Integer input1, Integer input2){
			key.put("+", new add());
			key.put("-", new subtract());
			key.put("/", new divide());
			key.put("*", new multiply());
		
		
		mathProblem handler = key.get(operator);
		handler.execute(input1, input2);
	}
}