package loops;

public class WhileLoop {

	public static void main(String[] args) {
		//Print 1-10
		/*int i=1; // initilization
		while(i<=10) // condition 
		{
			System.out.println(i);
			i++; // inc
		}*/
		
		// print Hello 10 times
		/*int i= 1;
		while(i<=10)
		{
			System.out.println(i+" Hello");
			i++;
		}*/
		
		//Print even number from 1-10
		/*int i= 2;
		while(i<=10)
		{
			System.out.println(i);
			i+=2; //i=i+2
		}*/
		
		int i = 1;
		while (i <= 10) {
		    if (i % 2 == 0) {
		        System.out.println(i);
		    }
		    i++;
		}


	}

}
