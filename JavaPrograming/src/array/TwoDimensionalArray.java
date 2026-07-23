package array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int a [][]= { {100,200},
				{300,400},
				{500,600}};
		
		// Find the size of an arry
		System.out.println("lenght of row "+a.length);
		System.out.println("lenght of columns "+a[0].length);
		
		// read single value from an array
		System.out.println(a[2][0]);
		
		
	}

}
