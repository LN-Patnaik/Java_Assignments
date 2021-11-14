package ordersPackage;
import java.util.Arrays;
import java.util.List;

public class lambdaexp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Orders> orders=Arrays.asList(new Orders(3455,"accepted"),
				new Orders(545666,"completed"),
				new Orders(50000,"pending"));
	orders.stream().filter(t->t.getPrice()>10000)
	.filter(t->t.getStatus().equals("accepted") || t.getStatus().equals("completed"))
	.forEach(t -> System.out.println(t));	

	
	}
}

