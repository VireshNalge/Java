package loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i=1;
		do {
			System.out.println(i);
			i++;
		}
		while(i<=10);*/
		
		int i=1;
		do {
			if(i%2==0) {
				
			System.out.println(i+" even");
			}
			else {
				System.out.println(i+" odd");
			}
			i++;
		}
			while(i<=10);
	}
}
