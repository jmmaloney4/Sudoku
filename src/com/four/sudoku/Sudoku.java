package com.four.sudoku;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.UnsupportedLookAndFeelException;

public class Sudoku {
	
	static Scanner scanner;
	static Puzzle puzzle = new Puzzle();
	static UIMgr UI = new UIMgr();
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		try {
			UI.Start();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (args.length < 1) {
			System.out.println("Not Enough Args");
			UI.AutoExit(3);
		}
		
		scanner = new Scanner(new File(args[0]));
		
	}
}
