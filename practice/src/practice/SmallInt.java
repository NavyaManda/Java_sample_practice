package practice;

public class SmallInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={20,7,0,-9};
		int min=a[0];
		int i=a.length;
		for(int j=0;j<i;j++)
		{
			if(a[j]< min)
			{
				min=a[j];
			}
		}

		 System.out.println(min);
	}

}
