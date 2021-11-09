import java.util.HashSet;
import java.util.Set;

public class HashSetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		e1.displayDetails(123, 40000, "Ram", "Science");
		e2.displayDetails(66, 30000, "shyam", "Maths");
		e3.displayDetails(3, 20000, "mohan", "Biology");
		HashSet<Employee> emp=new HashSet<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		for(Employee e:emp)
		{
			System.out.println(e);
		}
	}

	

}
class Employee
{
	int id,salary;
	String name,dept;
	void displayDetails(int id, int salary, String name, String dept )
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
		this.dept=dept;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employ Details:[Id:"+id+" Name:"+name+" Salary:"+salary+" dept:"+dept+"]";
	}
}
