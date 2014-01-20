package sudoku;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Sudoku {

	public static final String USAGE_STATMENT = "Usage: java sudoku.Sudoku path/to/sudoku/file";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Sudoku-Solving Program");

		// Check if user has submitted arguments
		if (args.length == 0) {
			System.err.println("E: Not enough arguments");
			System.err.println(Sudoku.USAGE_STATMENT);
			System.exit(1);
		}

		// A buffered reader to read the size of the file
		File file = new File(args[0]);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		int count = 0;
		while (reader.read() != -1) {
			count++;
		}
		// trashes the BufferedReader for garbage collection
		reader = null;

		Scanner scan = new Scanner(new FileInputStream(file));
	}
}
