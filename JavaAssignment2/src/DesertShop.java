import java.util.*;
abstract class DesertItem
{
	abstract void getCost();
}

class candy extends DesertItem
{
	int dollar=120;
	void getCost()
	{
		int price=dollar*60;
		System.out.println("Price of candy in rupees:Rs "+price);
	}
}
class cookie extends DesertItem
{
	int euro=100;
	void getCost()
	{
		int price=euro*70;
		System.out.println("Price of cookie in rupees:Rs "+price);
	}
}
class icecream extends DesertItem
{
	int rupees=120;
	void getCost()
	{
		int price=rupees;
		System.out.println("Price of candy in rupees:Rs "+price);
	}
}

class storage
{
	Scanner sc=new Scanner(System.in);
	void addItem()
	{
		System.out.println("Add item:");
		String item=sc.next();
		System.out.println(item+" "+"added to storage");
	}
}

public class DesertShop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		storage st=new storage();
		candy cy=new candy();
		cookie ck=new cookie();
		icecream i=new icecream();
		System.out.println("Are you a owner or a customer:");
		String str=sc.next();
		if(str.equals("owner"))
		{
			st.addItem();
		}
		else if(str.equals("customer"))
		{
			System.out.println("Available items:Cookies,Ice-cream,,Candy");
			System.out.println("What do you want to buy:");
			String choose=sc.next();
			if(choose.equals("cookie")) 
			{
				ck.getCost();
				System.out.println("Type 'yes' to place order:");
				String y=sc.next();
				if(y.equals("yes"))
				{
				System.out.println("Cookie ordered");
				}
			}
			else if(choose.equals("candy"))
			{
				cy.getCost();
				System.out.println("Type 'yes' to place order:");
				String yy=sc.next();
				if(yy.equals("yes"))
				{
				System.out.println("Candy ordered");
				}
			else if(choose.equals("ice-cream"))
			{
				cy.getCost();
				System.out.println("Type 'yes' to place order:");
				String yyy=sc.next();
				if(yyy.equals("yes"))
				{
					System.out.println("Ice-cream ordered");
				}
			}
			
		}
	}
	}
}
