
public class singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d=Demo.getObject();
		
	}

}

class Demo
{
	static Demo d=null;
	 private Demo()
	 {
		 System.out.println("one instance created");
	 }
	 public static Demo getObject()
	 {
		 if(d==null)
		 {
			 d=new Demo();
		 }
		 return d;
	 }

}



