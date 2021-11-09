abstract class A //As the class contains one abstract method, the class should have prefix abstarct
{
	abstract void display(); //abstract method
	void show()
	{
		System.out.println("Class A is abstract because it has one abstract method");
	}
}

abstract class B extends A //we can declare a class abstract without having abstract method
{
	void display()
	{
		System.out.println("Abstract method of class A");//overridden abstract method from super class
	}
	void show()
	{
		super.show();
		System.out.println("Class B is abstract without having abstract methods");
	}
}

class C extends B
{
	void show()
	{
		super.show();
		System.out.println("Class C is a normal class which extends abstract class B");
	}
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C obj=new C();
		obj.show();

	}

}
