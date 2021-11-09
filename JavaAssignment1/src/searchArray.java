import java.util.*;
public class searchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements into array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
					
		}
		System.out.println("Your Array is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);			
		}
		System.out.println();
		System.out.println("Enter number to be searched:");
		int n=sc.nextInt();
		boolean found=false;
		for(int i=0;i<arr.length;i++)
		{
			if(n==arr[i])
			{
				found=true;
				break;
			}		
		}
		if(found)
		{
			System.out.println("Searched element is present in array");
		}
		else
		{
			System.out.println("Searched element is not present in array");
		}
	}

}
