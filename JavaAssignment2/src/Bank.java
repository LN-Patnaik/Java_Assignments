class savings
{
	int fixed_deposit=500000;
	void display()
	{
		System.out.println("Cash in savings accounts:Rs "+fixed_deposit);
	}
}
class current extends savings
{
	int cash_credit=750000;
	void display()
	{
		super.fixed_deposit=500000;
		super.display();
		System.out.println("cash is current account:Rs "+cash_credit);
	}
}
class totCash extends current
{
	void display()
	{
		super.display();
		int total=cash_credit+fixed_deposit;
		System.out.println("Total cash in bank:Rs "+total);
	}
}

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		totCash t=new totCash();
		t.display();
	}

}
