package hpProbCalc;

import java.util.Random;

public class Main {

	public static int[] ivs = new int[] { 0, 0, 0, 0, 0, 0 };
	public static double hpfQty = 0;

	public static void main(String[] args) {

		for (int i = 0; i < 100000000; i++) {
			randomiseIVs();
			if (isHPF()) {
				hpfQty++;
			}
		}
		System.out.println((hpfQty / 1000000));
	}

	private static void randomiseIVs() {
		ivs = new int[] { 0, 0, 0, 0, 0, 0 };
		Random r = new Random();
		int IV;

		for (int i = 0; i < 6; i++) {
			IV = r.nextInt(2);
			ivs[i] = IV;
		}

		if (ivs[0] + ivs[1] + ivs[2] + ivs[3] + ivs[4] + ivs[5] < 3) {
			randomiseIVs();
		}
	}

	private static boolean isHPF() {
		if (ivs[3] == 1 || ivs[5] == 1 || ivs[4] == 0) {
			return false;
		}
		if (ivs[1] != ivs[2]) {
			return true;
		}
		return false;
	}
}
