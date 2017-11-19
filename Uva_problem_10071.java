package uva;

import java.util.Scanner;

public class Uva_problem_10071 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int velocity, time;
		while (input.hasNext()) {
			velocity = input.nextInt();
			time = input.nextInt();
			int displacement = ((time * 2) * velocity);
			System.out.println(displacement);
		}
		input.close();
	}

}
