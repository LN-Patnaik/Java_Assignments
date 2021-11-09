class Employee
{
	int salary=20000,allowances=5000;
	void totalSalary()
	{
		int tot=salary+allowances;
		System.out.println(tot);
	}
}
class Manager extends Employee
{
	int incentive=10000;
	void totalSalary()
	{
		int tot=incentive+salary+allowances;
		System.out.println("Total salary of Managers are: "+tot);
		
	}
}
class Labour extends Employee
{
	int overtime=2000;
	int salary=8000;
	void totalSalary()
	{
		int tot=salary+overtime;
		System.out.println("Total salary of labourers are: "+tot);
	}
}

public class override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager m=new Manager();
		m.totalSalary();
		Labour l=new Labour();
		l.totalSalary();

	}

}
