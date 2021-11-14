import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface info
{
	int authorId();
	String author() default "ram";
	String Supervisor() default "shyam";
	String date();
	String time();
	int version();
	String description()default "annot class";
}




@info(authorId=34,date="11/11/21",time="9 pm",version=12)
public class annot2 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
