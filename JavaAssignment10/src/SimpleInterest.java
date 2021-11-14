interface Simple
{
	int interest(int p, int t, int r);
}


public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Simple lambdaSimple=(var p, var t, var r)->p*t*r/100;
		System.out.println("Simple Interest:"+lambdaSimple.interest(3444,56,7));
		
	}

}
