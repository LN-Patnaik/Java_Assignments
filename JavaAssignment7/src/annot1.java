import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class annot1 {

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test {
	int test_case();

}

	@Test(test_case = 1)
	public static void testCase() {
		System.out.println("this is method 1");

	}


	public static void main(String[] args) {
		testCase();
	}
}