package arrayPractice;

public class FindMissingNumber {
	public static void main(String[] args) {
		int a[]= {1,3,5};
		
		int n = 5; // given arrays max 5
		
		for (int i=1;i<5;i++)//This loop checks every number one by one.
			{
			boolean found = false; // we assume the current number is not present.
			
			for(int j=0;j<a.length;j++)// This loop searches the array.
			{
				if(a[j]==i) // Check index value with number (like a[0] is 1 ,a[1]=2 )
				{
					found =true;
					break;
				}
			}
				if(!found) {
					System.out.println(i);
				}
			
		}
		
		
}
}