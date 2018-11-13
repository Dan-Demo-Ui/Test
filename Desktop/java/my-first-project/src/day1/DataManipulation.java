package day1;

import java.util.Scanner;

public class DataManipulation {

	public static void main(String[] args) {
//		Scanners --> program can take certain data (information) form user using Scanners.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your name");
//		String name = scan.nextLine();
//		System.out.println(name);
//		System.out.println("Enter your age");
//		int age = scan.nextInt();
//		System.out.println(age);
//	
//		if(name.equals("James Bond")){
//			System.out.println("Name is james, James Bond");
//			}
//		
//		else {
//			System.out.println("Fake");
//		}
	
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number between 1-12");
		int num = scan.nextInt();
		switch(num) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3: 
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6: 
			System.out.println("June");
			break;	
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9: 
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12: 
			System.out.println("December");
			break;
		default:
			System.out.println("invalid input");
			break;
				
		
		
		
		}
	
	}

}
