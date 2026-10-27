package string;

import java.util.Scanner;

public class ImportantStringPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. Reverse string
		 // 1st method using for loop
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		
		String rev = "";
		for (int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println("Original String is: " + str);
		System.out.println("Reversed String is : "+rev);
		

	}
	
	// 2nd is StringBuilder.reverse 
	
	

}
