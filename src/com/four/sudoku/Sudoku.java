package com.four.sudoku;

import java.util.Scanner;

public class Sudoku {
	
	static Scanner scanner;
	static Puzzle puzzle = new Puzzle();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 1) {
			System.out.println("Not Enough Args");
			System.exit(1);
		}
		scanner = new Scanner(args[0]);
		
		
		
	}
}
