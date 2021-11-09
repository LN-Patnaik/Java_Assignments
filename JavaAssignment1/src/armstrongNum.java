import java.util.*;
public class armstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int r;
		int temp=n,sum=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
		if(temp==sum)
		{
			System.out.println("The given no."+" "+temp+" "+"is an armstrong num");
		}
		else
		{
			System.out.println("The given no."+" "+temp+" "+"is not an armstrong num");
		}
		
	}

}
