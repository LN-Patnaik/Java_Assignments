import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Product> set=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{	
		System.out.println("Enter product num:");
		int a=sc.nextInt();
		set.add(new Product(a));
		}
		for(Product p:set)
		{
			System.out.println(p);
		}

}}
class Product
{
	int p;
	Product(int p)
	{
		this.p=p;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product:"+p;
	}
	
}
