package array;

public class SinagleDimensional {

	public static void main(String[] args) {
		// Approach 1
	/*	int a[]=new int[5]; // use we have fixed size
		a[0] = 10;
		a[1]=15;
		a[2]=5;
		a[3]=89;
		a[4]=100;*/
		
		// Approach 2
		int a[]= {5,87,56,74,45,84,55,22,7,};
		
		//System.out.println(a.length);
		//System.out.println(a[1]); // find index value
		
		// Reading the value from array
		// Normal for loop
	/*	for(int i=0;i<a.length;i++) // i<=4 ,i<5 (for approach 1)  i<=a.length-1, i<a.lenghth (for approach 2)
			
		{
			 System.out.println(a[i]);
		}  */  
		 // enhanced for loop
		for(int x:a)
		{
			System.out.println(x);
		}
 	}

}
