package arrayPractice;

public class SearchingElementInArray {

	public static void main(String[] args) {
		int a[]= {10,50,40,20,55};
		int search_element = 100;
		boolean status = false; // false for not found
		
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i] == search_element)
			{
				System.out.println("Element Found ");
				status = true;
				break;
			}
			if(status == false) {
				System.out.println("Element not found");
			}
		}
		*/
		for(int x:a) 
		{
			if(x == search_element)
			{
				System.out.println("Element Found ");
				status = true;
				break;
			}
		}
			if(status == false)
			{
				System.out.println("Element not found");
			}
		}
			
		}
		
		 
	
	


