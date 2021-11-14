import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.Annotation;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute
{
	int sequence() default 0;
}
class MyClass
{

	@Execute(sequence=1)
	void method2()
	{
		System.out.println("method 2");
	}
	@Execute(sequence=2)
	void method1()
	{
		System.out.println("method 1");
	}
	@Execute(sequence=3)
	void method3()
	{
		System.out.println("method 3");
	}
}


public class annot3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass m=new MyClass();
		m.method2();
		m.method1();
		m.method3();
		Class c=m.getClass();
		Annotation an=(Annotation) c.getAnnotation(Execute.class);
		Execute ex=(Execute)an;
		System.out.println(ex.sequence());
		
	}

}
