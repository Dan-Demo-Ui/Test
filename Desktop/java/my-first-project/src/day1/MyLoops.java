package day1;

import java.util.Scanner;

public class MyLoops {

	public static void main(String[] args) {
	
//		int i = 43;
//		
//		String name = "bond";
//	
//		String str = String.valueOf(i); //converting int to string
//		
//		System.out.println(str);
		
		
		
//		String name = "james";
//		String name1 = "";
//		for(int i=name.length()-1;i>=0;i--) {
//			name1 = name1 + name.charAt(i);
//		}
//		System.out.println(name1);
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		
//		for(int i=0;i<num;i++) {
//			System.out.println(i);
//			if(i%2==0)
//			
//			{
//				System.out.println("even");
//			}
//			else if(i%2==1) {
//				System.out.println("odd");
//			}
//		}
		int k = 1;
		while(true) {
			
			System.out.println("please enter number" + k++);
			int n = scan.nextInt();
			if(n%2!=0) {
				break;
				}
			
		}
			
		
			System.out.println("End");
	
		}
			
	
};
