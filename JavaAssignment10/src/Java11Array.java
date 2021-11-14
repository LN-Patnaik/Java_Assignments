import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java11Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="A quick brown fox jumps over lazy dog";
		ArrayList<String> strarr=new ArrayList();
		strarr.addAll(Arrays.asList(str.split(" ")));
		System.out.println(strarr);
		String[] arr=strarr.toArray(new String[0]);
		Arrays.stream(arr).forEach(System.out::println);
		
		
		
	}

}
