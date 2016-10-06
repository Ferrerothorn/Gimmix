package sumOfSquares;

import java.util.ArrayList;
import java.util.Collections;

public class SquareHacker {

	static ArrayList<Integer> squares = new ArrayList<Integer>();

	String breakdown(int i) {
		fillSquaresArray(i);
		Collections.sort(squares);
		Collections.reverse(squares);
		return squares.toString();
	}

	private static void fillSquaresArray(int input) {
		int highestRoot = 1;
		while (highestRoot * highestRoot <= input) {
			highestRoot++;
		}
		highestRoot--;
		squares.add(highestRoot);
		input = input - (highestRoot * highestRoot);
		if (input > 0) {
			fillSquaresArray(input);
		}
	}

	public void clearArray() {
		squares.clear();
	}
}
