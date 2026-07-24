package arrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TakeInputArraysFromUser {

	public static void main(String[] args) {
		// Take 5 user input
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println("Enter the number for the posstion "+i+ " is");
			a[i]=sc.nextInt();
		}
		System.out.println("Printing Array Elements..........");
		System.out.println(Arrays.toString(a));
	}

}
