
public class simpleandcompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int p=5000,r=2,t=10,n=12;
		int si=(p*t*r)/100;
		double ci=p*(Math.pow(1+(r/n),n*t));
		System.out.println("Simple interest is:"+si);
		System.out.println("compound interest is:"+ci);
		
	}

}
