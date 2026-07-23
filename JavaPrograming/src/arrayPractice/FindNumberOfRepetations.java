package arrayPractice;

public class FindNumberOfRepetations {

	public static void main(String[] args) {
		int a[]= {100,200,45,100,50,60,45};
		int num= 100;
		int count = 0;
		
		for(int value :a)
		{
		//	System.out.println(value);
			if(num == value) {
				count++;
			}
		
	}
		System.out.println(count);
	}

}
