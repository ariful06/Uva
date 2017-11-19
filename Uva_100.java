package uva;

import java.util.Scanner;

public class Uva_100 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
	
	
	
	
	while(input.hasNext()) {
		int i,j;
		
		i = input.nextInt();
		j= input.nextInt();

	
		for( int count=i;count<=j;count++) {
			 int temp;
			 temp = count;
		System.out.print(temp);
		System.out.print(" ");
		while(temp!=1) {
			
		 if(temp%2==1) {
			 temp = 3*temp+1;
		 }
		 else {
			 temp= temp/2;
		 }
		 System.out.print(temp);
		 System.out.print(" ");
		}
		
		
		System.out.println();
	}
	}
	
	}

}
