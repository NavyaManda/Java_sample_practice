package practice;

public class SumofEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,7,5,4,9};
		int x=0;
		
		for(int i=0;i<a.length;i++ )
		{
			if(a[i]%2==0)
			{
				x=(x+a[i]);
			}
		}
		System.out.println(x);
			
		

	}

}
