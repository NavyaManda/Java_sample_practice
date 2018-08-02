package practice;

public class SumofOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,4,7,6,9,11};
		int x=0;
		
		for(int i=0; i<a.length; i++)
		{
			
			if(a[i]%2==1)
			{
				x=(x+a[i]);
			}
		}
		System.out.println(x);

	}

}
