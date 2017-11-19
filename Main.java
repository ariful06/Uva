package uva;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 0, b = 0, T, sum = 0;
		T = input.nextInt();
		if (T >= 1 && T <= 100) {
			for (int i = 1; i <= T; i++) {
				a = input.nextInt();
				b = input.nextInt();
				if (a >= 0 && b >= a && b <= 100) {
					for (int j = a; j <= b; j++) {
						if (j % 2 != 0) {

							sum = sum + j;
						}
					}
					System.out.println("case:" + i + "=" + sum);
				}

			}

		}

		input.close();
	}

}
