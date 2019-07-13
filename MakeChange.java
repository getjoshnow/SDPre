package com.skilldistillery.datatypes.labs;

import java.util.Scanner;

public class MakeChange {
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		int  _1bill = 100, _5bill= 500, _10bill = 1000, _20bill= 2000;
		int  _25c = 25, _10c = 10, _5c = 5, _1c = 1;
		
		do {
		int itemPrice = getItemPrice();
		int userMoney = getUserInput();
		
		if (!tooLittleOrEqual(userMoney, itemPrice)){
			userMoney -= itemPrice;
			System.out.print("Result:");
			int leftOver = CalcFixedUnits(userMoney, _20bill, '$');
			leftOver = CalcFixedUnits(leftOver, _10bill, '$');
			leftOver = CalcFixedUnits(leftOver, _5bill, '$');
			leftOver = CalcFixedUnits(leftOver, _1bill, '$');
			leftOver = CalcFixedUnits(leftOver, _25c, 'c');
			leftOver = CalcFixedUnits(leftOver, _10c, 'c');
			leftOver = CalcFixedUnits(leftOver, _5c, 'c');
			leftOver = CalcFixedUnits(leftOver, _1c, 'c');
		}
		}while (runAgain());		
		System.out.println("Thank you for using Cash Register");
	}

	private static boolean runAgain() {
		
		System.out.print("would like to run again? (Y or N): ");
		String runAgain = kb.next();
		if (runAgain.equalsIgnoreCase("Y")) {
			return true;
		}
		return false;
	}

	private static void commasPeriods(int userMoney) {
		if	(userMoney > 0)
		System.out.print(", ");
		else
		System.out.println(".");
		
	}

	private static int CalcFixedUnits(int userMoney, int billType, char type) {

		if	(userMoney/billType > 0) {
			int HowMany = userMoney/billType;
			System.out.print(" "+HowMany ); 
			printWords(billType);
			
		userMoney = userMoney - (billType*HowMany);
		commasPeriods(userMoney);
		}
		return userMoney;
	}

	private static boolean tooLittleOrEqual(int userMoney, int itemPrice) {
		
		if (userMoney < itemPrice){
			System.out.println("The customer provided too little money. ");
			return true;
		}
		else if (userMoney == itemPrice) {
			System.out.println("The customer provided exact amount. No change required. ");
			return true;
		}
		else {return false;}
		}

	private static int getItemPrice() {
		
		
		System.out.print("Enter the price of item:  ");
		
		double userInput = kb.nextDouble();
		int userInputCovInt = (int)(userInput *100);	
		
		return userInputCovInt;
	}

	private static int getUserInput() {
		
		System.out.print("How much money was tendered by the customer  ");
		double userInput = kb.nextDouble();
		
		int userInputCovInt = (int)(userInput *100);	
		
		return userInputCovInt;
	}
	private static void printWords(int billType) {
		
	switch(billType){
	case 2000: System.out.print(" twenty dollar bill");
		break;
	case 1000: System.out.print(" ten dollar bill");
		break;
	case 500: System.out.print(" five dollar bill");
		break;
	case 100: System.out.print(" one dollar bill");
		break;
	case 25: System.out.print(" quarter");
		break;
	case 10: System.out.print(" dime");
		break;
	case 5: System.out.print(" nickel");
		break;
	case 1: System.out.print(" pennies");
		break;
	}
		}

}
