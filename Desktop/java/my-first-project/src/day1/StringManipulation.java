package day1;

public class StringManipulation {

	public static void main(String[] args) {
	
		
		String name = "james";
		String name1 = "";
		for(int i=name.length()-1;i>=0;i--) {
			name1 = name1 + name.charAt(i);
		}
		System.out.println(name1);
		
		
		//to cut string
		//substring--> two options;
		//1.from index to to Index
		//2.from index.
		
		String school = "Cybertek";
		
		System.out.println(school.substring(0,5));
		System.out.println(school.substring(5));
		System.out.println(school.isEmpty());
	}

}
