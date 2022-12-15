package assignment;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] {3,5,6,8,7,1}; 
		int temp = 0;
		for( int i=0; i<a.length; i++)
		{
		for(int j=i+1; j<a.length; j++)
		{
		if( a[i] > a[j] )
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		}
		}
		for( int i=0; i<a.length; i++ )
		System.out.println( a[i] +"");
	}

}
