package jcalc;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    
	public static void main(String[] args) {

		char menuSelection = ' ';

    	while (menuSelection != 'X' || menuSelection !='x') {
    		displayMenu();
    		menuSelection = getMenuSelection();
    		processSelection(menuSelection);
    	}

	}

	private static void processSelection(char menuSelection_) {

		switch(menuSelection_) {
		case 'a':
		case 'A':
			loadCalculator();
			break;
		case 'b':
		case 'B':
			System.out.println("(B) Converter selected");
			break;
		case 'x':
		case 'X':
		case 'q':
		case 'Q':
			System.out.println("(X) Exiting program...");
            System.exit(0);
			break;
		}
		
	}

	private static void loadCalculator() {
		System.out.println("(A) Calculator selected");
		System.out.println("Enter value 1 : ");
		int value1 = input.nextInt();
		System.out.println("Enter operation: * - + / ");
		char operation = input.next().charAt(0);
		System.out.println("Enter value 2 : ");
		int value2 = input.nextInt();
		int result = 0;
		switch(operation) {
		case '+':
			result = add(value1,value2);
			break;
		case '*':
			result = mult(value1,value2);
			break;
		case '-':
			result = sub(value1,value2);
			break;
		case '/':
			result = div(value1,value2);
			break;
		default:
			break;
			
		}
		clearScreen();
		System.out.println("================================");
		System.out.println("    " + value1 + " " + operation + " " + value2 + " = " + result);
	}

	private static char getMenuSelection() {
		System.out.println("Please enter your selection  >>  ");
		String menuSelection = input.nextLine();
		char getSelection = ' ';
		if( menuSelection.length() > 0 )
		{
			getSelection = menuSelection.charAt(0);
		}
			return getSelection;
	}

	private static void displayMenu() {
		System.out.println("================================");
		System.out.println("Jcalc - Calculator and Converter");
		System.out.println("(A) Calculator");
		System.out.println("(B) Converter");
		System.out.println("(X) Exit");
		System.out.println("================================");
	}
	
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
	}
		
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
    	if(y == 0 ) {
    		return 0;
    	} else {
	        int result = x/y;
	        return result;
    	}

    }
	
}
