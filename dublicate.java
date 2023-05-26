
public class dublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = new int [] {2,3,3,4,5,4,6,8,9,2};
System.out.println("Dublicate elements in given array are:");

for(int i=0; i<a.length ;i++)
{
	for(int j=i+1; j<a.length ;j++)
	{
		
if(a[i]==a[j])
	
System.out.print(a[j]+" ");
}
    }
	    }

              }

