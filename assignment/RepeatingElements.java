package assignment;

public class RepeatingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] {1,2,3,4,2,7,8,8,3};
		System.out.println(" Duplicate Elements: ");
		for( int i=0; i<a.length; i++ )
		{
		for( int j=i+1; j<a.length; j++ )
		{
		if( a[i] == a[j] )
	System.out.println(a[i]);
		}
		}
	}

}
