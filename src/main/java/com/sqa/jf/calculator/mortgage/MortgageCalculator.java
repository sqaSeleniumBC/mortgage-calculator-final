package com.sqa.jf.calculator.mortgage;

import java.util.*;
/**
 * File Name: MortgageCalculator.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 25, 2016
 */

/**
 * MortgageCalculator //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
/**
 * Create an application which calculates the mortgage of a house given the
 * principle, interest and term. The application should do the following steps:
 * Welcome the user to the application. Ask the user what the property ID is.
 * Ask the user what the principle is (ex: 200000), the interest (ex: .0575),
 * and term in months (360). Calculate the payments based on the formula below:
 * double monthlyPayment = (principle * interest) / (1 - Math.pow( 1 + interest,
 * -termInMonths)); Let the user know what the payments would be each month, for
 * how many years and months for what property. Not just total months based on
 * supplied term (Must use modulus operator). Ask the user if they would like to
 * find out the mortgage of another home and if not, exit. Echo a farewell
 * message to the user. Exit the application. NOTE: To compare Strings you must
 * use equals method or equalsIgnoreCase(). <b>For example: if
 * (input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("q")) {... pg 70,
 * Java24Hrs
 */
public class MortgageCalculator {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Declare local variables
		String propertyID;
		String input;
		double principle;
		double interest;
		int termMonths;
		double monthlyPayment;
		boolean hasMoreHomes;
		// Welcome user to the application
		System.out.println("Welcome to the Mortgage Calculator");
		do {
			// Ask the user what the propertyID is
			System.out.print("Which property would you like calculate the mortgage on:");
			// Get the property ID and store it in a variable propertyID
			propertyID = scanner.nextLine();
			// Ask the user what the principle is
			System.out.print("What is the principle:");
			// Get the principle and store it in a variable input
			input = scanner.nextLine();
			// Convert input String to a double type variable
			principle = Double.parseDouble(input);
			// Ask the user what the interest is
			System.out.print("What is the interest:");
			// Get the interest and store it in a variable input
			input = scanner.nextLine();
			// Convert input String to a double type variable
			interest = Double.parseDouble(input);
			// Ask the user what the term in months is
			System.out.print("What is the term in months:");
			// Get the termMonths and store it in a variable input
			input = scanner.nextLine();
			// Convert input String to a double type variable
			termMonths = Integer.parseInt(input);
			// Calculate monthly payments
			monthlyPayment = (principle * interest / 12) / (1 - Math.pow(1 + interest / 12, -termMonths));
			// Output information to he user
			System.out.println("Your monthly payments for " + propertyID + " will be " + Math.round(monthlyPayment)
					+ " for a total of " + termMonths / 12 + " years and " + termMonths % 12 + " months.");
			// Loop for Yes or No to continue application to break out of first
			// loop unless invalid option entered
			while (true) {
				// Ask the user if they would like to calculate mortgage for
				// another home
				System.out.print("Would you like to calculate mortgage for another home? (Yes/Y or No/N)");
				// Capture the input from the current user adn assign it to the
				// input variable
				input = scanner.nextLine();
				// If input equals Yes or Y while also ignore case sensitiveness
				if (input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("Y")) {
					// Set homes to true to continue outer loop
					hasMoreHomes = true;
					// Break out of inner loop
					break;
					// Else if input equals No or N while also ignore case
					// sensitiveness
				} else if (input.equalsIgnoreCase("No") || input.equalsIgnoreCase("N")) {
					// Set homes to false to break outer loop
					hasMoreHomes = false;
					// Break out of inner loop
					break;
				} else {
					// Let the user know that they entered invalid input
					System.out.println("Invalid Input");
					// Continue to ask the user wig they want to calculate
					// mortgage for another home
					continue;
				}
			}
			// While the boolean variable hasMoreHomes is set to true
		} while (hasMoreHomes);
		// Say farewell to the user
		System.out.println("Thank you for using the Mortgage Calculator application. \nGood Bye");
		// Close the Scanner object
		scanner.close();
		// Exit the System
		System.exit(0);
	}
}
