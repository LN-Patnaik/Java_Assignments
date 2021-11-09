import java.util.*;
 class Student {

	
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String name;
		int A,B,C,avg,total;
		
		 Student()
		{
			System.out.println("Enter student's name:");
			name=sc.next();
			getReport();
			
		}
		 public void getReport()
		 {
			 System.out.println("Enter marks for sub A:");
				A=sc.nextInt();
				System.out.println("Enter marks for sub B:");
				B=sc.nextInt();
				System.out.println("Enter marks for sub C:");
				C=sc.nextInt();
				total=A+B+C;
				System.out.println("Total marks of"+" "+name+" "+"is:"+total);
				avg=total/100;
				System.out.println("Average marks of"+" "+name+" "+"is:"+avg);
		 }
		
	}
 public class StudentReport
	{
		public static void main(String[] args) {
		
		Student s[]=new Student[3];
		for(int i=0;i<3;i++)
		{
			s[i]=new Student();
		}
		
	}

}



