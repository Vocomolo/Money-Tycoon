package com.money.tycoon.main;

import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
		
		System.out.print("Welcome to Money Tycoon \n");
		System.out.println("-----------------------");
		menu();
		
	}
	
	public static void menu() {
		
		int choice;
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("1. New Game");
		System.out.println("2. Load Game");
		System.out.print("Choice: ");
		choice = scan.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("You created a new game!");
			break;
		
		case 2:
			System.out.println("You loaded a saved game!");
			break;
			
		default:
			System.out.println("Invalid Input!");
			break;
		
		}
		
	}
	
}
