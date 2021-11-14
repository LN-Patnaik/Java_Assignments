import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class lambdaexp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		list1.stream().forEach(t -> System.out.println("number is:"+t)); //consumer
		list1.stream().filter(t->t%2!=0).forEach(t -> System.out.println("odd is:"+t)); //predicate
		List<Integer> list2=Arrays.asList();
		System.out.println(list2.stream().findAny().orElseGet(()->8));//supplier
		
		
		Function<Integer,String> getInt=t->t*5+":is the answer after multiplying by 5";//function
		System.out.println(getInt.apply(9));
		
	}

}
