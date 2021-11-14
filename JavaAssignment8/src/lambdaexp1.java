interface Arithmetic  //functional interface
{
	int ArithmeticOp(int a,int b);
}
public class lambdaexp1 {

	public static void main(String[] args) {
		
		Arithmetic lambdaSum=(int a,int b)->a+b;
		System.out.println("Addition:"+lambdaSum.ArithmeticOp(6, 8));
		Arithmetic lambdaSub=(int a,int b)->a-b;
		System.out.println("Substraction:"+lambdaSub.ArithmeticOp(6, 8));
		Arithmetic lambdaMul=(int a,int b)->a*b;
		System.out.println("Multiplication:"+lambdaMul.ArithmeticOp(6, 8));
		Arithmetic lambdaDiv=(int a,int b)->{
			if(b==0)
			return 0;
		return a/b;	
		};
		System.out.println("Division:"+lambdaDiv.ArithmeticOp(7, 1));
	}

}
