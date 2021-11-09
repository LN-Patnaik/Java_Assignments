import java.util.*;
public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of subject-1:");
		int m1=sc.nextInt();
		System.out.println("Enter marks of subject-2:");
		int m2=sc.nextInt();
		System.out.println("Enter marks of subject-3:");
		int m3=sc.nextInt();
		int result=m1+m2+m3/100;

		if(result>60)
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		if((m1+m2)>60 || (m3+m2)>60 || (m1+m3)>60)
		{
			System.out.println("Promoted");
		}
		else
		{
			System.out.println("Not Promoted");
		}

	}

}
