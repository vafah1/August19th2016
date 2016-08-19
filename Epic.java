package com.encryptionproject.explorer;

import java.util.Scanner;

public class Epic
{
	static boolean retry = true;

	public static void main(String[] args) 
	{

		Scanner codeScanner = new Scanner(System.in);
		Scanner userShift = new Scanner(System.in);

		String userInput = null;
		String theMessageToBeCoded = null;
		String menuChoice = null;

		int shiftChoice = 0;
		int randomShift = 0;


		System.out.println("Welcome to the Caesar Cipher Encryptor\n "
				+ "MENU:\n"
				+ "(1) Enter a message to encrypt with a shift of 13\n"
				+ "(2) Enter a message to encrypt with your choice of shift\n"
				+ "(3) Enter a message to encrypt with a random shift\n"
				+ "(4) Exit the App");

		menuChoice = codeScanner.nextLine();


		switch (menuChoice)
		{
		case "1":

			System.out.println("Please enter the message you wish to encrypt: ");
			userInput = codeScanner.nextLine();
			theMessageToBeCoded = userInput;
			Utils.encrypt(theMessageToBeCoded, 13);
			System.out.println(Utils.encrypt(theMessageToBeCoded, 13));
			break;
			
		case"2":

			System.out.println("Please enter a message to encrypt: ");	
			userInput = codeScanner.nextLine();
			theMessageToBeCoded = userInput;
			System.out.println("Please enter your desired shift amount: ");
			shiftChoice = userShift.nextInt();
			System.out.println(Utils.encrypt(theMessageToBeCoded, shiftChoice));
			break;

		case "3" :	

			randomShift = (int)(Math.random() * 26) + 1;
			System.out.println("Please enter a message to encrypt: ");	
			userInput = codeScanner.nextLine();
			theMessageToBeCoded = userInput;
			Utils.encrypt(theMessageToBeCoded, randomShift);
			System.out.println(Utils.encrypt(theMessageToBeCoded, randomShift));
			break;

		case "4" : 

			System.out.println("Thanks for using our app!");
			System.exit(0);

		default:

			System.out.println("I'm sorry, you've made an invalid selection. Please try again...");
			break;
		}
	}
}



