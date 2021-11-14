import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

class MyOperator implements UnaryOperator<String> {
	@Override
	public String apply(String t) {
		return t.toUpperCase();
	}
}
 
public class lambdaexp6 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Ram");
		list.add("Shyam");
		list.add("Mohan");
		list.add("Rohit");
		System.out.println("Elements in list are:");
		System.out.println(list);
		System.out.println(" ");
		list.replaceAll(new MyOperator());
		System.out.println("Elements in list after replacing with upper case letters are:");
		System.out.println(list);
		
	}

}
