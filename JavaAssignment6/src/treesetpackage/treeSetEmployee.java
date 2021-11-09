package treesetpackage;
import java.util.*;
import java.util.TreeSet;

public class treeSetEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 'a': To view details 'ID' wise order");
		System.out.println("Enter 'b': To view details 'Salary' wise order");
		System.out.println("Enter 'c': To view details 'Name' wise order");
		System.out.println("Enter 'd': To view details 'Department' wise order");
		System.out.println("Enter your choice:");
		String str=sc.next();
		if(str.equalsIgnoreCase("a"))
		{
		EmpIdComparator empidcomp=new EmpIdComparator();
		TreeSet<Employee> ts=new TreeSet<>(empidcomp);
		Employee ram=new Employee(4,20000,"Ram","science");
		Employee shyam=new Employee(3,60000,"Shyam","maths");
		Employee ravi=new Employee(2,210000,"Ravi","physics");
		Employee kishan=new Employee(9,820000,"Kishan","chemistry");
		ts.add(ram);
		ts.add(shyam);
		ts.add(ravi);
		ts.add(kishan);
		for(Employee e:ts)
		{
			System.out.println(e);
		}
		}
		else if(str.equalsIgnoreCase("b"))
		{
		salaryComparator salcomp=new salaryComparator();
		TreeSet<Employee> ts=new TreeSet<>(salcomp);
		Employee ram=new Employee(4,20000,"Ram","science");
		Employee shyam=new Employee(3,60000,"Shyam","maths");
		Employee ravi=new Employee(2,210000,"Ravi","physics");
		Employee kishan=new Employee(9,820000,"Kishan","chemistry");
		ts.add(ram);
		ts.add(shyam);
		ts.add(ravi);
		ts.add(kishan);
		for(Employee e:ts)
		{
			System.out.println(e);
		}
		}
		else if(str.equalsIgnoreCase("c"))
		{
			nameComparator namcomp=new nameComparator();
			TreeSet<Employee> ts=new TreeSet<>(namcomp);
			Employee ram=new Employee(4,20000,"Ram","science");
			Employee shyam=new Employee(3,60000,"Shyam","maths");
			Employee ravi=new Employee(2,210000,"Ravi","physics");
			Employee kishan=new Employee(9,820000,"Kishan","chemistry");
			ts.add(ram);
			ts.add(shyam);
			ts.add(ravi);
			ts.add(kishan);
			for(Employee e:ts)
			{
				System.out.println(e);
			}
		}
		else if(str.equalsIgnoreCase("d"))
		{
			deptComparartor depcomp=new deptComparartor();
			TreeSet<Employee> ts=new TreeSet<>(depcomp);
			Employee ram=new Employee(4,20000,"Ram","science");
			Employee shyam=new Employee(3,60000,"Shyam","maths");
			Employee ravi=new Employee(2,210000,"Ravi","physics");
			Employee kishan=new Employee(9,820000,"Kishan","chemistry");
			ts.add(ram);
			ts.add(shyam);
			ts.add(ravi);
			ts.add(kishan);
			for(Employee e:ts)
			{
				System.out.println(e);
			}
		}
}

}
