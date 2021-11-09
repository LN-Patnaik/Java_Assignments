import java.io.*;
 class SavingAccount
{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	 	
	 void withDraw() throws IOException 
	 {
		 
		 double balance;
		 System.out.println("Enter your balance: ");
		 balance=Double.parseDouble(br.readLine());
		System.out.println("Your Balance is:Rs "+balance);
		 System.out.println("Enter the amount you want to withdraw:");
		 double amount=Double.parseDouble(br.readLine());
		 try
		 {
		 if(amount>balance || amount==0)
		 {
			 throw new InsufficientBalanceException("Insufficient amount");
		 } 
		 else if(amount<0)
		 {
			 throw new IllegalBankTRansactionExceptionException("Negative amounts are not allowed");
		 }
		 else
		 {
			 double currentamt=balance-amount;
			 System.out.println("Amount withdrawn: "+amount);
			 System.out.println("Current amount in bank: "+currentamt);
		 }
		 }
		 catch(Exception ex)
		 { 
			 System.out.println(ex);
		 }
	
		 
	 }
}
 	 
public class ExceptionProgram3 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		SavingAccount sa=new SavingAccount();
		sa.withDraw();
	}

}


class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}
class IllegalBankTRansactionExceptionException extends Exception
{
	public IllegalBankTRansactionExceptionException(String msg)
	{
		super(msg);
	}
}
