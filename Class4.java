package homework1_programming;

import java.util.Scanner;

public class Class4 {
	public static void main(String[] args) {

		Scanner order = new Scanner(System.in);
	    String letter;
	    
	    System.out.println("Enter letter"); 
	    letter = order.nextLine();   
		switch(letter) {
		case"a":
		case"A":
			System.out.println("Your order BayChha");
			break;
		case"b":
		case"B":
			System.out.println("Your order Ice Tea");
			break;
		case"c":
		case"C":
			System.out.println("Your order Suop");
			break;
		}
		
	}

}
