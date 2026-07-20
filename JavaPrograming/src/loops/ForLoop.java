package loops;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print 10-1
		/*for(int i=10;i>=1;i--)  // for 1-10 (int i=1,i<=10;i++)
		{
			System.out.println(i);
		}
*/
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i + " even");
			}
			else {
				System.out.println(i+ " odd");
			}
		}
	}

}
