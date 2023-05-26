
public class BubbleSort {
	
		public static void main(String[] args) {
			
	int[] a= {7,4,5,1,3,2,6};
	for(int i=0; i<a.length; i++)
	{
	for(int j=1; j<a.length-i ; j++)
	{
		if(a[j]<a[j-1])
		{
			int temVar= a[j];
				 a[j]= a[j-1];
				 a[j-1]= temVar;
			
		}

	        }
	}
	for(int elem: a)
	{
	System.out.print(elem+" ");
		}

	}
	}


