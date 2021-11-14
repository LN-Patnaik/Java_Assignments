import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.function.Predicate;

public class Java11File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		var uri="C:\\Users\\LAPATNAI\\eclipse-workspace\\JavaAssignment10\\src\\StudentList.txt";
		Files.lines(Path.of(uri)).filter(Predicate.not(String::isEmpty)).forEach(System.out::println);
		int count=(int)Files.lines(Path.of(uri)).filter(Predicate.not(String::isEmpty)).count();
		System.out.println("count of students:"+count);
	}

}
