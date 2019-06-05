package appController;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			Controller calculate = new Controller();
			Integer number1;
			Integer number2;
		
			String function;
		
			System.out.print("Enter a number: ");
			number1 = Integer.parseInt(input.nextLine());
		
			System.out.print("Enter the simple operate: ");
			function = input.nextLine();
		
			System.out.print("Enter a number: ");
			number2 = Integer.parseInt(input.nextLine());
		
			System.out.print("The answer is: ");
		
			calculate.functionMaker(function,number1,number2);	
	
		}catch (NumberFormatException ex) {
			System.out.println();
			System.out.println("Enter a number");
	    	System.out.println();
	    	Scanner input = new Scanner(System.in);
			Controller calculate = new Controller();
			Integer number1;
			Integer number2;
		
			String function;
		
			System.out.print("Enter a number: ");
			number1 = Integer.parseInt(input.nextLine());
		
			System.out.print("Enter the simple operator: ");
			function = input.nextLine();
		
			System.out.print("Enter a number: ");
			number2 = Integer.parseInt(input.nextLine());
		
			System.out.println("The result is: ");
		
			calculate.functionMaker(function,number1,number2);
		}
	}
}