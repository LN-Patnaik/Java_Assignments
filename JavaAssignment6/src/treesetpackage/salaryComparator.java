package treesetpackage;

import java.util.Comparator;

public class salaryComparator implements Comparator<Employee> 
{
	

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary() > o2.getSalary())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
