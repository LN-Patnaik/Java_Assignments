import java.util.*;
public class incomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your ctc: ");
		int ctc=sc.nextInt();
		int tax;
		if(ctc<=180000)
		{
			System.out.println("No tax to be paid");
		}
		else if(ctc>180000 && ctc<=300000)
		{
			tax=10*(ctc/100);
			System.out.println("Tax to be paid:Rs "+tax);
		}
		else if(ctc>300000 && ctc<=500000)
		{
			tax=20*(ctc/100);
			System.out.println("Tax to be paid:Rs "+tax);
		}
		else
		{
			tax=30*(ctc/100);
			System.out.println("Tax to be paid:Rs "+tax);
		}
	}

}
