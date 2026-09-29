package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the temperature:");
		
		double temperature = in.nextDouble();
		
		in.close();
		
		
		if(temperature < 5) {
			
			System.out.println("You can go skiing.");
			
		}
		
		else if(temperature >= 5 && temperature <= 15) {
			
			System.out.println("You can go cinema.");
			
		}
		
		else if(temperature > 15 && temperature <= 25) {
			
			System.out.println("You can go on a picnic.");
		}
		
		else {
			
			System.out.println("You can go swimming");
		}

	}

}
