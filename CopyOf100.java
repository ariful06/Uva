package uva;

import java.util.Scanner;

public class CopyOf100 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int startRange;
		int endRange;
		while (input.hasNext()) {
			startRange = input.nextInt();
			endRange = input.nextInt();
			int from = Math.min(startRange, endRange);
			int to = Math.max(startRange, endRange);
			int maxCount = 0;
			for (int i=from; i<=to; i++) {
				int temp = i;
				int currentCount = 1;
				while (temp != 1) {
					if (temp % 2 == 1) {
						temp = 3 * temp + 1;
					} else {
						temp = temp / 2;
					}
					currentCount++;
				}
				
				if( currentCount > maxCount ) {
					maxCount = currentCount;
				}
			}
			System.out.println(startRange+" "+ endRange+" " +maxCount);
		}
		input.close();
	}
}