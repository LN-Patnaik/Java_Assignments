import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,Double> map=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter num for key:");
			Integer a=sc.nextInt();
			System.out.println("Enter num for value:");
			Double b=sc.nextDouble();
			map.put(a, b);
			
			//System.out.println(map.put(a, b));
		}
		
		Set<Integer> keys=map.keySet();
		for(Integer key:keys)
		{
			System.out.println(key +":"+map.get(key));
		}
	}

}
