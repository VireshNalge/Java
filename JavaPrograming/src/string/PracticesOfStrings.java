package string;

import java.util.Arrays;

public class PracticesOfStrings {

	public static void main(String[] args) {
		//1 find length
		String s = "Welcome";
		System.out.println(s.length());
		
		System.out.println("Hello".length());
		
		//2 Concat
		String s1= "Welcome ";
		String s2 = "Viresh";
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));
		
		//3 Trim :- Remove the spaces from left and right side
		String a= "    Hello  ";
		System.out.println(a);
		System.out.println("Before trime "+a.length());
		System.out.println(a.trim());
		System.out.println("After Trime "+a.trim().length());
		
		//4 charAt() starts from index
		s= "Welcome";
		System.out.println(s.charAt(4));
		
		// 5 replace - replace the single charters from string
		s= "Welcom to Selenium java selenuim , python selenium";
		System.out.println(s.replace("e", "v"));
		
		// 6 subString:- extract substring from main string
		
		// staring index - 0  ending index -1
		s="Viresh";
		System.out.println(s.substring(2,6)); // resh
		
		// 7 toUpperCase() .toLoweCase()
		// split():- split the string into multiple parts based on delimeter
		s="abc@gmail.com";
		String a1[] = s.split("@");
		//System.out.println(a1[0]);
		// System.out.println(a1[1]);
		System.out.println(Arrays.toString(a1));
		/*ex 1
		String v="$12,13,15";
		System.out.println(v.replace("$", "").replace(",", ""));
		*/
		
		//ex 2
		String q = "abc,123@xyz";
		System.out.println(q.replace(",", "").replace("@", ""));//abc123xyz
		// in array
		String arr1[]= q.split(",");
		System.out.println(Arrays.toString(arr1));//[abc, 123@xyz]
		
		String arr2[]= arr1[1].split("@");
		System.out.println(Arrays.toString(arr2)); //[123, xyz] 
		
		System.out.println(arr1[0]);//abc
		System.out.println(arr2[0]);//123
		System.out.println(arr2[1]);//xyz
		
		
		
	}

}
