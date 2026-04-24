/**
	* File: Lesson 4.6 - Data type checking
	* Author: Mr. Kalisz
	* Date Created: April 12, 2023
	* Date Last Modified: April 15, 2026
	*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int intChecker() {

		Scanner input = new Scanner(System.in);

		System.out.println("Input an integer: ");
		
		int num;

		while (!(input.hasNextInt())) {
			input.nextLine();
			System.out.println("Input an integer: ");
		}
		
		num = input.nextInt();
		
		return num;		
	}	

	public static double doubleChecker() {
		
		Scanner input = new Scanner(System.in);


		double num;

		System.out.println("Input a number: ");


		while (!(input.hasNextDouble())) {
			input.nextLine();
			System.out.println("Input a number: ");
		}
		
		num = input.nextDouble();
		
		return num;
	}

	public static boolean booleanChecker() {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Input a boolean: ");

		boolean bool;

		while (!(input.hasNextBoolean())) {
			input.nextLine();
			
			System.out.println("Input a boolean: ");

		}

		bool = input.nextBoolean();

		return bool;
	}

	public static boolean multipleIntChecker() {

		Scanner input = new Scanner(System.in);

		int num;

		for (int i = 0; i < 4; i++ ) {
			
			System.out.println("Input an integer: ");


			while (!(input.hasNextInt())) {
				input.nextLine();
				System.out.println("Input an integer: ");
			}

			num = input.nextInt();
			 
		}

		return true;		

	}
}