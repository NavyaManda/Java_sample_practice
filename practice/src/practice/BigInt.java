package practice;

public class BigInt {

	public static void main(String[] args) {
		int a[]={9,3,10,5,12};
		int i=a.length;
		int big=a[0];
		for(int j=0;j<i;j++)
		{
			if(a[j]>big)
			{
				big=a[j];
			}
		}
		System.out.println(big);

	}

}
