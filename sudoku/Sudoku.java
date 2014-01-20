package sudoku;

import java.io.IOException;

import javax.swing.UnsupportedLookAndFeelException;

public class Sudoku {

	public static final String USAGE_STATMENT = "Usage: java sudoku.Sudoku path/to/sudoku/file";
	public static UIMgr UIMgr = new UIMgr();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Sudoku Puzzle Solving Program");
		int needed = 10;
		// Check if user has submitted arguments
		/*
		 * if (args.length == 0) {
		 * System.err.println("E: Not enough arguments");
		 * System.err.println(Sudoku.USAGE_STATMENT); System.exit(1); }
		 * 
		 * 
		 * // A buffered reader to read the size of the file File file = new
		 * File(args[0]); BufferedReader reader = new BufferedReader(new
		 * FileReader(file)); int count = 0; while (reader.read() != -1) {
		 * count++; } // trashes the BufferedReader for garbage collection
		 * reader = null; // File Loader not implemented now // Scanner scan =
		 * new Scanner(new FileInputStream(file));
		 */
		try {
			UIMgr.Start(needed);
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
		int[] b = new int[81];
		b[1] = 1;
		b[0] = 0;
		b[2] = 2;
		Puzzle puzzle = new Puzzle(b);
		Sudoku.SolvePuzzle(puzzle);
	}

	public static Puzzle SolvePuzzle(Puzzle p) {
		int c = 1;
		int r = 1;
		for (int a = 0; a < 9; a++) {
			for (int b = 0; b < 9; b++) {
			}
		}
		return p;
	}
}
