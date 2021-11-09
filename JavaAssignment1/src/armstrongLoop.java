
public class armstrongLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r,sum=0;
		for(int i=100;i<1000;i++)
		{
			int n=i;
			while(n>0)
			{
				r=n%10;	
				sum=sum+r*r*r;
				n=n/10;
			}
			if(sum==i)
			{
				System.out.print(i+" ");
			}
			sum=0;
		}
		
	}

}
