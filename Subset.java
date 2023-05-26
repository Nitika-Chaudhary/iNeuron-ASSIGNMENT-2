
public class Subset {

	public static void main(String[] args) {
		
		int[] a1= {2,5,6,8,9,10};
		int[] a2= {12,5,8};
		boolean b= false;
		int j;
		for(int i=0; i<a2.length; i++)
		{
			for(j=0; j<a1.length; j++)	
			{
				
		if (a2[i]==a1[j])
		{
		b = true;
		break;
	}
		else {
			b= false;
		}
			}
			if(j==a1.length)
			{
				break;
			}
		  }
		
		if(b==true) {
			
			System.out.println("a2 array is a subset of a1 array");
	
		}	
		
		else
			
		{
			System.out.println("a2 array is not a subset of a1 array");	
		}
			}
	
	   }
	
