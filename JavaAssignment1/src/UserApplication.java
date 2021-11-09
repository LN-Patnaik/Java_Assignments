import java.util.*;
public class UserApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0,attempts=3;
		String user="ram";
		String pass="123";
		for(int i=0;i<3;i++) 
		{
			System.out.println("Enter username:");
			String username=sc.next();
			System.out.println("Enter password:");
			String password=sc.next();
			
			if(username.equals(user) && password.equals(pass))
			{
				System.out.println("Welcome"+" "+user);
				break;
			}
			else
			{	
				System.out.println("Incorrect username or password");
			}
			attempts--;
			System.out.println("You have"+" "+attempts+" "+"attempts left");
			count++;	
		  
		}
		if(count==3)
		{
			System.out.println("Contact Admin!");
			System.exit(1);
		}
	}

}
