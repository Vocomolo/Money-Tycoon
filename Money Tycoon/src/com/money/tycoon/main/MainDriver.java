package com.money.tycoon.main;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainDriver {
	
	private final static int sizeX = 500;
	private final static int sizeY = 500;
	
	private static JFrame mainFrame;
	private static JPanel btnPanel;
	private static JButton newButton;

	public static void main(String[] args) {
		
		mainFrame = new JFrame("Money Tycoon");
		
//		System.out.print("Welcome to Money Tycoon \n");
//		System.out.println("-----------------------");
//		menu();
		
		mainFrame.setLayout(new CardLayout());
		mainFrame.setSize(sizeX, sizeY);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
		
		btnPanel = new JPanel();
		
		btnPanel.setSize(sizeX / 5, sizeY / 5);
		btnPanel.setVisible(true);
		
		newButton = new JButton("New Game");
		
		btnPanel.add(newButton);
		mainFrame.add(btnPanel);
		
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
