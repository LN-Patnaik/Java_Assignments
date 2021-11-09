import java.util.*;
public class ExceptionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter value for a: ");
			int a=sc.nextInt();
			System.out.println("enter value for b: ");
			int b=sc.nextInt();
			try
			{
				int c=a/b;
				System.out.println("c= "+c);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Divide by zero");
				System.out.println(e);
			}
	}

}
